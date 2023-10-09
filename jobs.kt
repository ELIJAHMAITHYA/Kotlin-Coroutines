import com.example.koltincoroutines.ui.theme.KoltinCoroutinesTheme
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext


val job1 = GlobalScope.launch(Dispatchers.Default) {
    repeat(5) {
        println("Coroutine still running")
        delay(1000)

    }
    run{
        job1.join()
        println("Main Thread is continuing ")
    }
}





suspend fun networkCall() {
    delay(2000)
    println("Heres the network call")
}