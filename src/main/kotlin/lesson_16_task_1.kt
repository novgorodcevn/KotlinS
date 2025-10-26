class Cube {
    private val randomCount = (1..6).random()

    fun getRandomCount() = randomCount
}

fun main() {

    val cube = Cube()
    println( cube.getRandomCount())
}