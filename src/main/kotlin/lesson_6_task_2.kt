import java.lang.Thread.sleep

fun main() {
    println("Начало отчета")
    print("Время в секундах:")
    val timer = readln().toLong()
    val timeMilliseconds: Long = timer * ONE_SECOND
    sleep(timeMilliseconds)
    println("Прошло $timer секунд")
}

const val ONE_SECOND = 1000