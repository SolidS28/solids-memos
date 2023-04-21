package com.solids.springdemokotlin.dtos.task

import com.solids.springdemokotlin.enitites.Task

data class TaskResponseDto(
    val id: Long,
    override val message: String,
    override val url: String?
): TaskBaseDto(message, url) {
    constructor(task: Task) : this(task.id!!, task.message, task.url)
}