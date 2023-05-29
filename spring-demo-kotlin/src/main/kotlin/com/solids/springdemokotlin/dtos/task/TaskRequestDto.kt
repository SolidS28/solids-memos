package com.solids.springdemokotlin.dtos.task

import com.solids.springdemokotlin.utils.NoArg
import jakarta.validation.constraints.NotEmpty

@NoArg
data class TaskRequestDto(
    @NotEmpty
    override val message: String,
    @NotEmpty
    override val url: String?
) : TaskBaseDto(message, url)
