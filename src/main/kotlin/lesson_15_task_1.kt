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

class Bird() : Flying, Floating

class Fish() : Floating

fun main() {

    val crucianCarp = Fish()
    crucianCarp.toSwim()

    val seagull = Bird()
    seagull.toSwim()
    seagull.toFly()

    val duck = Bird()
    duck.toSwim()
    duck.toFly()
}