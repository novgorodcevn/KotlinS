class Circle(
    private val radius: Int,
) {
    private val pi = 3.14

    fun calculateCircumference() = 2 * pi * radius

    fun calculateArea() = pi * radius * radius
}

fun main() {
    val circle = Circle(radius = 25)
    println(circle.calculateArea())
    println(circle.calculateCircumference())
}