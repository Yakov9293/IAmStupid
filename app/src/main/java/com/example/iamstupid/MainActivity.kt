package com.example.iamstupid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listOfTasks = supportFragmentManager.findFragmentByTag("LIST_OF_TASK") as? ListOfTasks
            ?: ListOfTasks()

        supportFragmentManager.beginTransaction()
            .replace(R.id.frame_content, listOfTasks, "LIST_OF_TASK").addToBackStack(null)
            .commit()
    }


}
