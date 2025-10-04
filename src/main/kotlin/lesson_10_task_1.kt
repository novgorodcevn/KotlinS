fun main() {
    val playerResult = rollDice()
    println("Игрок бросил кости,результат:$playerResult")
    val computerResult = rollDice()
    println("Компьютер бросил кости,результат:$computerResult")

    when {
        playerResult > computerResult -> println("Победило человечество")
        playerResult < computerResult -> println("Победила машина")
        else -> {
            println("Победила дружба")
        }
    }
}

fun rollDice(): Int {
    val randomNumber = (1..6).random()
    return randomNumber
}