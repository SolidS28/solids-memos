package com.solids.springdemokotlin.exceptions

import org.springframework.http.HttpStatus
import org.springframework.web.server.ResponseStatusException

class NotFoundException(
    className: String,
    filter: String
) : ResponseStatusException(HttpStatus.NOT_FOUND, "Could not found class [$className] with filter [$filter]")
