package lesson_5

fun main() {
    println("Докажите что вы не бот")
    print("Сложите два числа:2+2=")
    val count = readln().toIntOrNull()
    if (count == null) {
        println("Вы ввели не число")
    }
    val resultCount = when (count) {
        4 -> "Добро рожаловать!"
        else -> "Доступ запрещен"
    }
    println(resultCount)
}