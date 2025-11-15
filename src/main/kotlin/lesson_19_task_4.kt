enum class Patron(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20),
}

class Tank {
    private var loadCartridge: Patron? = null

    fun loadCartridge(patron: Patron) {
        loadCartridge = patron
    }

    fun shoot() {
        if (loadCartridge == null) {
            println("Снарядов нет")
        } else {
            println("Выстрел соверщен,нанесения урона ${loadCartridge?.damage}")
        }
    }
}

fun main() {
    val tank = Tank()
    tank.shoot()
    tank.loadCartridge(Patron.BLUE)
    tank.shoot()
    tank.loadCartridge(Patron.GREEN)
    tank.shoot()
    tank.loadCartridge(Patron.RED)
    tank.shoot()
}