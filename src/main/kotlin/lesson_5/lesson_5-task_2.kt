package lesson_5

fun main() {
    val userYear = readln().toInt()
    val userAge = CURRENT_YEAR - userYear
    if (userAge >= AGE_OF_MAJORITY)
        println("Показать экран со скрытым контентом")
}

const val AGE_OF_MAJORITY = 18
const val CURRENT_YEAR = 2025