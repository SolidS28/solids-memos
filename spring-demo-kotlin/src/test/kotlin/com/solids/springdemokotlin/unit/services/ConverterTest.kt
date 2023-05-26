package com.solids.springdemokotlin.unit.services

import com.solids.springdemokotlin.dtos.task.TaskResponseDto
import com.solids.springdemokotlin.enitites.Task
import org.junit.jupiter.api.Test
import org.springframework.beans.BeanUtils
import java.util.*

class ConverterTest {

    @Test
    fun test() {
        val origin = Task(UUID.randomUUID(), "nicolas")
        val to = TaskResponseDto()
        BeanUtils.copyProperties(origin, to)
        println(origin.message)
        println(to.message)
    }
}