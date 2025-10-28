class Player(
    val name: String,
    private var health: Int,
    var impactForce: Int,
) {
    fun takeDamage(damage: Int) {
        health -= damage
        if (health <= 0) {
            health = 0
            deathHero()
        }
    }

    fun toHeal(heal: Int) {
        if (health > 0) {
            health += heal
        }
    }

    private fun deathHero() {
        health = 0
        impactForce = 0

        println("Игрок $name мертв\nЗдоровье равно 0\nСила удара равна 0")
    }
}

fun main() {
    val player = Player(
        name = "Artas",
        health = 100,
        impactForce = 30,
    )

    player.takeDamage(50)
    player.takeDamage(30)
    player.toHeal(30)
    player.toHeal(50)
    player.takeDamage(100)
}