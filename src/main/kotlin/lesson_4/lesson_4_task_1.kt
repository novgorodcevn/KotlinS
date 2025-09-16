package lesson_4

fun main() {

    val totalTables = 13

    var resultTables: Boolean = BOOKING_TODAY != totalTables
    println("Доступность столиков на сегодня $resultTables")

    resultTables = BOOKING_TOMORROW != totalTables
    println("Доступность столиков на завтра $resultTables")
}

const val BOOKING_TODAY = 13
const val BOOKING_TOMORROW = 9