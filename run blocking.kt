package com.example.koltincoroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main(){
    runBlocking {
        printMessage2()
        printForecast2()
        printTemperature2()
    }
    println("Exexutes after the rub blocking coroutine terminates")
}
suspend fun printForecast2() {
    delay(1000)
    println("Sunny")
}

suspend fun printTemperature2() {
    delay(1000)
    println("30\u00b0C")
}
suspend fun printMessage2(){
    delay(2000)
    println("The weather is good ")
}