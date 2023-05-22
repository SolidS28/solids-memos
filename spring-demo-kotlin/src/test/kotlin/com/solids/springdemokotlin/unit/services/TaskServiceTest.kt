package com.solids.springdemokotlin.unit.services

import com.solids.springdemokotlin.repositories.TaskRepository
import com.solids.springdemokotlin.services.TaskService
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import io.mockk.junit5.MockKExtension
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable

@ExtendWith(MockKExtension::class)
class TaskServiceTest {

    @MockK
    lateinit var taskRepository: TaskRepository

    @InjectMockKs
    lateinit var taskService: TaskService

    @Test
    fun getAllTasksSuccessfully() {
        val pageable = Pageable.unpaged()
        // given
        every { taskRepository.findAll(pageable) }.returns(Page.empty())
        // when
        val result = taskService.getAllTasks(pageable)
        // then
        assert(result.totalElements == 0L)
    }
}