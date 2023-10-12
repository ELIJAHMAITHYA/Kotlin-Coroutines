import kotlinx.coroutines.*

fun main() {
    runBlocking {
        println("Weather forecast")
        println( getWeatherReport())
        println("Have a good day!")
    }
}

suspend fun getWeatherReport() = coroutineScope {
    val forecast = async { getForecast() }
    val temperature = async { 
        try{ getTemperature()}
        catch (e : AssertionError){
            println("Found an error at RoundBlocking(): $e ")
            "{No  temperature found}"
        }

    }
    "${forecast.await()} ${temperature.await()}"
}

suspend fun getForecast(): String {
    delay(1000)
    return "Sunny"
}

suspend fun getTemperature(): String {
    delay(1000)
    throw AssertionError( "Temperature invalid")
    return "30\u00b0C"
}