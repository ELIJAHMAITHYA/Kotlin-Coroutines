import kotlinx.coroutines.*

fun main() {
    runBlocking {
        println("Weather forecast")
       println( getWeatherReport())
        println("Have a good day!")
    }
}
suspend fun getMessage(): String {
    delay(1000)
    return "Here is the whole message:"
}
suspend fun getForecast(): String {
    delay(1000)
    return "Sunny"
}

suspend fun getTemperature(): String {
    delay(1000)
    return "30\u00b0C"
}
suspend fun getWeatherReport ()= coroutineScope {
        val forecast = async {
            getForecast()
        }
        val temperature = async {
            getTemperature()
        }
        val message = async{
            getMessage()
}
        "${message.await()}: ${temperature.await()} :${forecast.await()}"
}