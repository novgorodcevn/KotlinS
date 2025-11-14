class Spaceship {

    fun takeOff() {
        TODO("Здесь нужна дополнительная логика взлёта космического корабля")
    }

    fun land() {
     //  TODO("Здесь нужна дополнительная логика приземления космического корабля")
    }

    fun shoot() {
        println("Выстрел произведён в астероид.")
    }
}

fun main() {
    val spase = Spaceship()
    spase.takeOff()
    spase.land()
    spase.shoot()
}