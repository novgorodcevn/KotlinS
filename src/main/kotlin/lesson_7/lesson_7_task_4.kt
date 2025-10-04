package lesson_7

import lesson_6.ONE_SECOND

fun main() {

    print("Введите секунды,для начало отчета:")
    val timerSeconds = readln().toInt()

    for (i in timerSeconds downTo 0) {
        Thread.sleep(lesson_7.ONE_SECOND)
        println("До конца осталось $i секунд")
    }
    println("Время вышло")
}

const val ONE_SECOND: Long = 1000