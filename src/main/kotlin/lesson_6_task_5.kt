fun main() {

    println("Докажите что вы не бот")
    var attempt = 3

    do {
        attempt--
        val firstNumber = (1..9).random()
        val secondNumber = (1..9).random()
        val resultSum = firstNumber + secondNumber
        print("Сложите два числа:$firstNumber+$secondNumber=")
        val userAnswer = readln().toIntOrNull()
        if (userAnswer == null) {
            println("Вы ввели не число")
            return
        }
        when {
            resultSum != userAnswer -> println("Предлагаю решить его заново")
            resultSum == userAnswer -> {
                println("Добро пожаловать!")
                return
            }
        }

    } while (attempt > 0)

    val resultMessage = "Доступ запрещен."

    println(resultMessage)
}