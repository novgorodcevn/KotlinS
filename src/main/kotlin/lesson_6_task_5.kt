fun main() {
    println("Докажите что вы не бот")
    var attempt = 3

    do {
        val firstNumber = (1..9).random()
        val secondNumber = (1..9).random()
        val resultSum = firstNumber + secondNumber
        print("Сложите два числа:$firstNumber+$secondNumber=")
        val userAnswer = readln().toIntOrNull()
        if (userAnswer == null) {
            println("Вы ввели не число")
            println("Попробуйте еще раз:")
            continue
        }
        if (resultSum != userAnswer) {
            attempt--
            println("Предлагаю решить его заново")
        } else {
            println("Добро пожаловать!")
            return
        }
    } while (attempt > 0)

    println("Доступ запрещен.")
}