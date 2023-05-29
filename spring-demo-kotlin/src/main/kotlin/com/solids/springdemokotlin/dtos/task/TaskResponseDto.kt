package com.solids.springdemokotlin.dtos.task

import com.solids.springdemokotlin.utils.NoArg
import java.time.Instant
import java.util.*

@NoArg
data class TaskResponseDto(
    var id: UUID,
    override var message: String,
    override var url: String?,
    var createdAt: Instant,
    var updatedAt: Instant?
): TaskBaseDto(message, url)