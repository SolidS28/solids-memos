package com.solids.springdemokotlin.dtos.task

import com.solids.springdemokotlin.utils.NoArg

@NoArg
open class TaskBaseDto(
    open val message: String,
    open val url: String?
)
