class Ship(
    name: String,
    var averageSpeed: Double,
    var portRegistration: String,
) {
    var name = name
        set(value) {
            println("Имя нельзя изменить")
        }
}

fun main() {

    val ship = Ship(
        name = "Петр1",
        averageSpeed = 40.1,
        portRegistration = "где то на арте)"
    )

    println(ship.name)
    ship.name = "petr1"
    println(ship.name)
}