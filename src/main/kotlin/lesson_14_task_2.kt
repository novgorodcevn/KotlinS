open class Liner2(
    val name: String = "Лайнер",
    val speed: Int = 56,
    val capacity: Int = 2695,
) {
    open fun startLoading() {
        println("выдвигает горизонтальный трап со шкафута")
    }

    open fun getShipProperties() {
        println("Имя:$name\nСкорость:$speed\nВместимость:$capacity")
    }
}

class Icebreaker2(
    name: String,
    speed: Int,
    capacity: Int,
) : Liner2(name, speed, capacity) {

    fun breakingIce() {
        println("колоть лед")
    }

    override fun startLoading() {
        println("открывает ворота со стороны кормы")
    }
}

class CargoShip2(
    name: String,
    speed: Int,
    val loadCapacity: Int,
) : Liner2(name, speed) {

    override fun startLoading() {
        println("активирует погрузочный кран")
    }

    override fun getShipProperties() {
        println("Имя:$name\nСкорость:$speed\nГрузоподъемность:$loadCapacity")
    }
}

fun main() {
    val liner = Liner2(
        name = "Лайнер",
        speed = 56,
        capacity = 2695
    )
    liner.startLoading()
    liner.getShipProperties()

    val icebreaker = Icebreaker2(
        name = "Ледокол",
        speed = 35,
        capacity = 230,
    )
    icebreaker.startLoading()
    icebreaker.breakingIce()
    icebreaker.getShipProperties()
    val cargoShip = CargoShip2(
        name = "Грузовой лайнер",
        speed = 50,
        loadCapacity = 20000,
    )
    cargoShip.startLoading()
    cargoShip.getShipProperties()
}