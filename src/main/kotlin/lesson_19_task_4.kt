enum class Patron(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20),
}

class Tank {
    private var loadCartridge: Patron? = null

    fun loadCartridge(patron: String) {
        when {
            patron.equals("синий", ignoreCase = true) -> loadCartridge = Patron.BLUE
            patron.equals("зеленый", ignoreCase = true) -> loadCartridge = Patron.GREEN
            patron.equals("красный", ignoreCase = true) -> loadCartridge = Patron.RED
            else -> loadCartridge = null
        }
    }

    fun Shoot() {
        if (loadCartridge == null) {
            println("Снарядов нет")
        } else {
            println("Выстрел соверщен,нанесения урона ${loadCartridge?.damage}")
        }
    }
}

fun main() {
    val tank = Tank()
    tank.Shoot()
    tank.loadCartridge("Синий")
    tank.Shoot()
    tank.loadCartridge("зеленый")
    tank.Shoot()
    tank.loadCartridge("красный")
    tank.Shoot()
}