package com.solids.springdemokotlin.services

import com.solids.springdemokotlin.dtos.convert
import com.solids.springdemokotlin.dtos.task.TaskRequestDto
import com.solids.springdemokotlin.dtos.task.TaskResponseDto
import com.solids.springdemokotlin.enitites.Task
import com.solids.springdemokotlin.exceptions.BadRequestException
import com.solids.springdemokotlin.exceptions.NotFoundException
import com.solids.springdemokotlin.repositories.TaskRepository
import com.solids.springdemokotlin.utils.isValidUrl
import org.springframework.data.domain.Pageable
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import java.util.*

@Service
class TaskService(
    val taskRepository: TaskRepository
) {
    fun createTask(taskRequestDto: TaskRequestDto): TaskResponseDto {
        if (taskRequestDto.url != null && !isValidUrl(taskRequestDto.url)) {
            throw BadRequestException("The url provided is not valid")
        }
        val taskEntity = convert<Task>(taskRequestDto)
        return convert<TaskResponseDto>(taskRepository.save(taskEntity))
    }

    fun getTask(id: UUID): TaskResponseDto {
        val taskEntity = taskRepository.findByIdOrNull(id)
            ?: throw NotFoundException(Task::class.simpleName!!, "(id=$id)")
        return convert<TaskResponseDto>(taskEntity)
    }

    fun getAllTasks(pageParams: Pageable) = taskRepository.findAll(pageParams)
}
