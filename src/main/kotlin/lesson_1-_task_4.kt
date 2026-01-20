import kotlin.text.equals

fun main() {
    var victoryCounter = 0
    do {
        val playerResult = rollDice()
        println("Игрок бросил кости,результат:$playerResult")
        val computerResult = rollDice()
        println("Компьютер бросил кости,результат:$computerResult")
        if (playerResult > computerResult) {
            victoryCounter++
        }
        println("Хотите бросить еще раз?")
        val userAnswer = readln()
    } while (ContinueTheRound(userAnswer) == true)
    println("Игрок выиграл $victoryCounter партий")
}

fun rollDice(): Int {
    val randomNumber = (1..6).random()
    return randomNumber
}

fun ContinueTheRound(userAnswer: String): Boolean {
    val responseResult = userAnswer.equals(POSITIVE_RESPONSE, true)
    return responseResult
}

const val POSITIVE_RESPONSE = "да"