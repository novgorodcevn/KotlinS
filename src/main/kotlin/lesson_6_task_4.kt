import kotlin.random.Random

fun main() {
    val correctNumber = (1..9).random()
    var attempt = 5
    do {
        attempt--
        val playerNumber = readln().toInt()
        when {
            (playerNumber != correctNumber)-> {
                println("оставшееся количество попыток $attempt")
            }
            playerNumber == correctNumber -> {
                println("Это была великолепная игра!")
                return
            }
        }
    } while (attempt > 0 )
    println("Было загадано число:$correctNumber")
}