package com.steevo.guessy

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GuessyApplication

fun main(args: Array<String>) {
	runApplication<GuessyApplication>(*args)
}

