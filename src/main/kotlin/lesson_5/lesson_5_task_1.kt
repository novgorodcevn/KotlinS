package lesson_5

fun main() {
    val randomValue1 = (0..30).random()
    val randomValue2 = (0..30).random()
    println("Докажите что вы не бот")
    print("Сложите два числа:$randomValue1+$randomValue2=")
    val userAnswer = readln().toIntOrNull()
    if (userAnswer == null) {
        println("Вы ввели не число")
        return
    }
    val resultSum = randomValue1 + randomValue2
    val resultMessage = if (resultSum == userAnswer) {
        "Добро пожаловать!"
    } else {
        "Доступ запрещен."
    }
    println(resultMessage)
}