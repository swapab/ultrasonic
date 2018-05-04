package com.example.ultrasonic

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class UltrasonicApplication

fun main(args: Array<String>) {
    runApplication<UltrasonicApplication>(*args)
}
