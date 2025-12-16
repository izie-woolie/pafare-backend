package com.woolie.pafare

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class PafareApplication

fun main(args: Array<String>) {
	runApplication<PafareApplication>(*args)
}

@RestController
class HelloController {
    @GetMapping("/hello")
    fun hello() = "Hello, authenticated user!"
}
