package com.example.iamstupid

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_of_tasks_fragment.*
import java.util.ArrayList

class ListOfTasks : Fragment() {

    private var tasks: ArrayList<Task> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = inflater.inflate(R.layout.list_of_tasks_fragment, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerTasks.layoutManager = LinearLayoutManager(view.context)

        val adapter: TaskAdapter = TaskAdapter(tasks, view.context)
        recyclerTasks.adapter = adapter

        addTask.setOnClickListener {
            tasks.add(Task(name = "Задача" + tasks.size))
            adapter.notifyItemChanged(tasks.size - 1)
        }
    }


}
