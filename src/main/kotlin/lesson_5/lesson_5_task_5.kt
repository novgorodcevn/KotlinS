package lesson_5

fun main() {
    val winningNumbers = List(LOTTERY_NUMBERS_COUNT) { (0..MAX_NUMBER).random() }
    val numbers = mutableListOf<Int>()

    println("Добро пожаловать в лотерею!")
    for (i in 1..LOTTERY_NUMBERS_COUNT) {
        print("Введите $i число от 0..42:")
        val userAnswer1 = readln().toInt()
        numbers.add(userAnswer1)
    }

    val comparisonResult = winningNumbers.intersect(numbers.toSet()).size
    val resultMessage = when (comparisonResult) {
        3 -> "Вы угодали все числа и выиграли джекпот"
        2 -> "Вы угадали два числа и получаете крупный приз"
        1 -> "Вами угадано одно число,выплачивается утешительный приз"
        else ->
            "Вы не угадали ни одного числа"

    }
    println(resultMessage)
    println("Выигрышные числа:$winningNumbers")
}

const val LOTTERY_NUMBERS_COUNT = 3
const val MAX_NUMBER = 42