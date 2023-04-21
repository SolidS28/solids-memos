package com.solids.springdemokotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoKotlinSpringApplication

fun main(args: Array<String>) {
	runApplication<DemoKotlinSpringApplication>(*args)
}
