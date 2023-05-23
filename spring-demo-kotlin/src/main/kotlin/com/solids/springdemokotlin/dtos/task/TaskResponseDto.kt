package com.solids.springdemokotlin.dtos.task

import com.solids.springdemokotlin.enitites.Task
import java.util.UUID

data class TaskResponseDto(
    val id: UUID,
    override val message: String,
    override val url: String?
): TaskBaseDto(message, url) {
    constructor(task: Task) : this(task.id, task.message, task.url)
    // TODO move to converter class to uncouple
}