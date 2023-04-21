package com.solids.springdemokotlin.services

import com.solids.springdemokotlin.NotFoundException
import com.solids.springdemokotlin.TaskRepository
import com.solids.springdemokotlin.dtos.task.TaskRequestDto
import com.solids.springdemokotlin.dtos.task.TaskResponseDto
import com.solids.springdemokotlin.enitites.Task
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class TaskService(
    val taskRepository: TaskRepository
) {
    fun createTask(taskRequestDto: TaskRequestDto) = TaskResponseDto(taskRepository.save(taskRequestDto.toEntity()))

    fun getTask(id: Long) = taskRepository.findByIdOrNull(id)
        ?: throw NotFoundException(Task::class.simpleName!!, "(id=$id)")
}