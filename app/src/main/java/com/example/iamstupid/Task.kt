package com.example.iamstupid

import java.util.*

class Task(
    val name: String = "Заголовок задачи",
    val description: String = "Описание задачи",
    val date: Date = Date(),
    val priority: Difficulty = Difficulty.MEDIUM
)
