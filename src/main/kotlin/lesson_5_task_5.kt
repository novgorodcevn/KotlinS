fun main() {
    val winningNumbers = List(3) { (0..42).random() }
    println("Добро пожаловать в лотерею!")
    print("Введите первое число от 0..42:")
    val userAnswer1 = readln().toInt()
    print("Введите второе число от 0..42:")
    val userAnswer2 = readln().toInt()
    print("Введите третье число от 0..42:")
    val userAnswer3 = readln().toInt()

    val userNumbers = mutableListOf(userAnswer1, userAnswer2, userAnswer3)
    val comparisonResult = winningNumbers.intersect(userNumbers.toSet())

    val listSize = comparisonResult.size
    val resultMessage = when (listSize) {
        3 -> "Вы угодали все числа и выиграли джекпот"
        2 -> "Вы угадали два числа и получаете крупный приз"
        1 -> "Вами угадано одно число,выплачивается утешительный приз"
        else -> {
            "Вы не угадали ни одного числа"
        }
    }
    println(resultMessage)
    println("Выигрышные числа:$winningNumbers")
}