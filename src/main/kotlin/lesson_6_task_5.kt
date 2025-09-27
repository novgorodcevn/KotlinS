fun main() {
    println("Докажите что вы не бот")
    var attempt = 3

    do {
        var firstNumber = (1..9).random()
        var secondNumber = (1..9).random()
        var resultSum = firstNumber + secondNumber
        print("Сложите два числа:$firstNumber+$secondNumber=")
        var userAnswer = readln().toIntOrNull()
        if (userAnswer == null) {
            println("Вы ввели не число")
            println("Попробуйте еще раз:")
            firstNumber = (1..9).random()
            secondNumber = (1..9).random()
            resultSum = firstNumber + secondNumber
            print("Сложите два числа:$firstNumber+$secondNumber=")
            userAnswer = readln().toIntOrNull()
        }
        when {
            resultSum != userAnswer -> {
                attempt--
                println("Предлагаю решить его заново")
            }
            resultSum == userAnswer -> {
                println("Добро пожаловать!")
                return
            }
        }
    } while (attempt > 0)

    println("Доступ запрещен.")
}