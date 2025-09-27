fun main() {
    val correctNumber = (1..9).random()
    var attempt = 5

    do {
        val playerNumber = readln().toInt()

        if (playerNumber != correctNumber) {
            attempt--
            println("оставшееся количество попыток $attempt")
        } else {
            println("Это была великолепная игра!")
            return
        }
    } while (attempt > 0)

    println("Было загадано число:$correctNumber")
}