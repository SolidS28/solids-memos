package com.solids.springdemokotlin.dtos.task

import com.solids.springdemokotlin.enitites.Task

data class TaskRequestDto(override val message: String, override val url: String?) : TaskBaseDto(message, url) {
    fun toEntity() = Task(message = message, url = url)
    // TODO move to converter class to uncouple
}
