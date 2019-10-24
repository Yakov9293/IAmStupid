package com.example.iamstupid

import java.util.*

class Task(
    val name: String = "Заголовок задачи",
    val description: String = "Описание задачи",
    val date: Date = Date(2019),
    val priority: Difficulty = Difficulty.MEDIUM
)
