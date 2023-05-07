package com.solids.springdemokotlin.repositories

import com.solids.springdemokotlin.enitites.Task
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.stereotype.Repository

@Repository
interface TaskRepository: PagingAndSortingRepository<Task, Long>