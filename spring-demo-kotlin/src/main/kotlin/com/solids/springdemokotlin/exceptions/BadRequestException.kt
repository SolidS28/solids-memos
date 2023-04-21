package com.solids.springdemokotlin.exceptions

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.client.HttpClientErrorException
import org.springframework.web.server.ResponseStatusException

class BadRequestException(
    reason: String
) : ResponseStatusException(HttpStatus.BAD_REQUEST, reason)
