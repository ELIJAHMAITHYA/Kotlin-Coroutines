package com.example.koltincoroutines

import kotlinx.coroutines.*
import kotlin.system.*

fun main() {
    runBlocking {
        println("Weather forecast")
        launch {
            printForecast()
        }
        launch {
            printTemperature()
        }
        launch {
            printMessage()
        }
    }
}

suspend fun printForecast() {
    delay(1000)
    println("Sunny")
}

suspend fun printTemperature() {
    delay(1000)
    println("30\u00b0C")
}
suspend fun printMessage(){
    delay(2000)
    println("The weather is good ")
}