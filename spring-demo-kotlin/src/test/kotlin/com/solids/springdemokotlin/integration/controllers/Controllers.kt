package com.solids.springdemokotlin.integration.controllers

import io.restassured.RestAssured.get
import org.apache.http.HttpStatus
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.Test

class PingControllerTest {

    @Test
    fun getPingSuccessfully() {
        get("/ping")
            .then()
                .statusCode(HttpStatus.SC_OK)
            .assertThat()
                .body("", equalTo("pong"))
    }
}