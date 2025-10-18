open class Liner(
    val name: String = "Лайнер",
    val speed: Int = 56,
    val capacity: Int = 2695,
)

class Icebreaker(
    name: String,
    speed: Int,
    capacity: Int,
) : Liner(name, speed, capacity) {

    fun breakingIce() {
        println("колоть лед")
    }
}

class CargoShip(
    name: String,
    speed: Int,
    val loadCapacity: Int,
) : Liner(name, speed)

fun main() {
    val liner = Liner(
        name = "Лайнер",
        speed = 56,
        capacity = 2695
    )
    val icebreaker = Icebreaker(
        name = "Ледокол",
        speed = 35,
        capacity = 230,
    )
    icebreaker.breakingIce()
    val cargoShip = CargoShip(
        name = "Грузовой лайнер",
        speed = 50,
        loadCapacity = 20000,
    )
}