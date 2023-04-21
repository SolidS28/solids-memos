package com.solids.springdemokotlin

import org.springframework.http.HttpStatus
import org.springframework.web.client.HttpClientErrorException
import kotlin.reflect.KClass

class NotFoundException(
    className: String,
    filter: String
    ): HttpClientErrorException(HttpStatus.NOT_FOUND, "Could not found class [$className] with filter [$filter]") {
}