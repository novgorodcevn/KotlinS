class Player(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int = 100
)

fun main() {
     val player = Player(
         name = "Геральд",
         currentHealth = 83
     )
    val healingPotion:(Player) -> String = { player: Player ->
        if (player.currentHealth < player.maxHealth) {
            "Игрок ${player.name} выпил лечебное зелье,востановленно:${player.maxHealth - player.currentHealth} единиц здоровья\n" +
                    "текущее здороье ${player.maxHealth.also { player.currentHealth = it }}"
        } else {
            "Текущее здоровье не может быть больше максимального"
        }
    }
   println(healingPotion(player))
}