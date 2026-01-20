interface Flying {

    fun toFly() {
        println("умеет летать")
    }
}

interface Floating {

    fun toSwim() {
        println("умеет плвать")
    }
}

class Seagull() : Flying, Floating

class Duck() : Floating

class CrucianCarp() : Floating

fun main() {

    val seagull = Seagull()
    seagull.toSwim()
    seagull.toFly()

    val duck = Duck()
    duck.toSwim()

    val crucianCarp = CrucianCarp()
    crucianCarp.toSwim()
}