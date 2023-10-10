import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.system.measureTimeMillis

suspend fun stuName(): String {
    delay(2000)
    return "Sila"
}

suspend fun SchoolName(): String {
    delay(3000)
    return "Kangach"
}

fun main() {
    GlobalScope.launch {
        val time = measureTimeMillis {
            val Stuname = async { stuName() }
            val schoolname = async { SchoolName() }
            println("Student name is: ${Stuname.await()}")
            println("School name is: ${schoolname.await()}")
        }
        println("Reguest took $time ms.")


    }


}