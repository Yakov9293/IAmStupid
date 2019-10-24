package com.example.iamstupid

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_task_elem.view.*

class TaskAdapter(val tasks: ArrayList<Task>, val context: Context) :
    RecyclerView.Adapter<TaskAdapter.ViewHolder>() {

    override fun getItemCount() = tasks.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(tasks.get(position))

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        LayoutInflater.from(context).inflate(
            R.layout.recycler_task_elem,
            parent,
            false
        )
    )


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val headTask = view.head_task
        val descriptionTask = view.description_task
        val deadlineTask = view.deadline_task

        fun bind(task: Task) {
            headTask.text = task.name
            descriptionTask.text = task.description
            deadlineTask.text = task.date.toString()
        }
    }
}