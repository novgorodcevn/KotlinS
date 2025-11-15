class Player(
    val key: Boolean,
)

fun main() {
    val player = Player(true)
    val player2 = Player(false)
    val verifyPlayerKey: (Player) -> String = { player ->
        if (player.key) {
            "Игрок открыл дверь"
        } else {
            "Дверь заперта"
        }
    }
    println(verifyPlayerKey(player))
    println(verifyPlayerKey(player2))
}