package com.solids.springdemokotlin.controllers

import com.solids.springdemokotlin.dtos.task.TaskRequestDto
import com.solids.springdemokotlin.dtos.task.TaskResponseDto
import com.solids.springdemokotlin.services.TaskService
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.web.PageableDefault
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/tasks")
class TaskController(
    val taskService: TaskService
) {
    @PostMapping
    fun createTask(@RequestBody taskRequestDto: TaskRequestDto) = taskService.createTask(taskRequestDto)

    @GetMapping("/{id}")
    fun getTask(@PathVariable id: Long) = taskService.getTask(id)

    @GetMapping
    fun getAllTasks(@PageableDefault(sort = ["id"]) pageParams: Pageable) = taskService.getAllTasks(pageParams)
}