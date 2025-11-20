class Player(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int = 100
)

fun Player.isHealthy() : Boolean {
    return currentHealth == maxHealth
}

fun main() {
    val player = Player(
        name = "Геральд",
        currentHealth = 100
    )
    println(player.isHealthy())
}