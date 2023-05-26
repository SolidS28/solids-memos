package com.solids.springdemokotlin.dtos.task

import com.solids.springdemokotlin.utils.ZERO_UUID
import java.time.Instant
import java.util.*

data class TaskResponseDto(
    val id: UUID,
    override val message: String,
    override val url: String?,
    val createdAt: Instant,
    val updatedAt: Instant
): TaskBaseDto(message, url) {
    constructor() : this(ZERO_UUID, "", null, Instant.MIN, Instant.MIN)
}
