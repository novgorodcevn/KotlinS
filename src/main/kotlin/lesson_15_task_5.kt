interface Movement {
    fun move() {
        println("начали ехать")
    }
}

interface PassengerTransportation {
    val maxPassengers: Int
    var currentPassengers: Int

    fun loadPassenger(count: Int) {
        if ((currentPassengers + count) <= maxPassengers) {
            currentPassengers += count
            println("Загрузили $count пассажиров")
        } else {
            println("Мест для $count пассажиров нет")
        }
    }

    fun unloadPassenger(count: Int) {
        if (currentPassengers - count >= 0) {
            println("Выгрузили $count пассажиров")
            currentPassengers -= count
            println("Осталось $currentPassengers пассажиров")
        }
    }
}

interface CargoTransportation {
    val maxCargo: Int
    var currentCargo: Int

    fun loadCargo(count: Int) {
        if ((currentCargo + count) <= maxCargo) {
            currentCargo += count
            println("Загрузили $count тонн груза")
        } else {
            println("Мест для $count тонн груза нет")
        }
    }

    fun unloadCargo(count: Int) {
        if (currentCargo - count >= 0) {
            println("Выгрузили $count тонн груза")
            currentCargo -= count
            println("Осталось $currentCargo тонн груза")
        }
    }
}

class CargoTruck : Movement, PassengerTransportation, CargoTransportation {
    override val maxPassengers = 1
    override var currentPassengers = 0

    override val maxCargo = 2
    override var currentCargo = 0
}

class PassengerCar : Movement, PassengerTransportation {
    override val maxPassengers = 3
    override var currentPassengers = 0
}

fun main() {
    val truck = CargoTruck()
    val car = PassengerCar()
    val car2 = PassengerCar()

    truck.loadPassenger(1)
    truck.loadCargo(2)
    truck.move()
    truck.unloadPassenger(1)
    truck.unloadCargo(2)

    car.loadPassenger(3)
    car.move()
    car.unloadPassenger(3)

    car2.loadPassenger(3)
    car2.move()
    car2.unloadPassenger(3)
}