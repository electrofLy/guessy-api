package com.steevo.guessy

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.servlet.config.annotation.EnableWebMvc

@SpringBootApplication
@EnableWebMvc
class GuessyApplication

fun main(args: Array<String>) {
	runApplication<GuessyApplication>(*args)
}

