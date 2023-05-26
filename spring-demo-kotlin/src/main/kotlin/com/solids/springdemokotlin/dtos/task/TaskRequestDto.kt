package com.solids.springdemokotlin.dtos.task

import javax.validation.constraints.NotEmpty

data class TaskRequestDto(
    @NotEmpty
    override val message: String,
    @NotEmpty
    override val url: String?
) : TaskBaseDto(message, url)
