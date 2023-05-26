package com.solids.springdemokotlin.enitites

import com.solids.springdemokotlin.utils.ZERO_UUID
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.GenericGenerator
import org.hibernate.annotations.UpdateTimestamp
import java.time.Instant
import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Task(
    @Id
    @GeneratedValue(generator = "uuid-hibernate-generator")
    @GenericGenerator(name = "uuid-hibernate-generator", strategy = "org.hibernate.id.UUIDGenerator")
    val id: UUID = ZERO_UUID,
    val message: String,
    val url: String? = null,
    @CreationTimestamp
    val createdAt: Instant = Instant.MIN,
    @UpdateTimestamp
    val updatedAt: Instant = Instant.MIN
)
