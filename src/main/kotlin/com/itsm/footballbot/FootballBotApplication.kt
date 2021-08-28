package com.itsm.footballbot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FootballBotApplication

fun main(args: Array<String>) {
    runApplication<FootballBotApplication>(*args)
}
