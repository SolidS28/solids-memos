package com.solids.springdemokotlin

import com.solids.springdemokotlin.enitites.Task
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface TaskRepository: CrudRepository<Task, Long>