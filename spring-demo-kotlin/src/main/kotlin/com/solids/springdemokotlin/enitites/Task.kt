package com.solids.springdemokotlin.enitites

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Task(
    @Id @GeneratedValue
    val id: Long = 0,
    val message: String,
    val url: String?
)