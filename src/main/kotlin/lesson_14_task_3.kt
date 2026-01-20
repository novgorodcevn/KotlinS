import kotlin.math.PI

abstract class Figure(
    val color: String,
) {
    abstract fun calculateArea(): Double

    abstract fun calculatePerimeter(): Double
}

class Сircle(
    val radius: Double,
    color: String,
) : Figure(color) {

    override fun calculateArea(): Double {
        return PI * radius * radius
    }

    override fun calculatePerimeter(): Double {
        return 2 * PI * radius
    }
}

class Rectangle(
    val width: Int,
    val height: Int,
    color: String,
) : Figure(color) {

    override fun calculateArea(): Double {
        return width * height.toDouble()
    }

    override fun calculatePerimeter(): Double {
        return 2 * (width + height).toDouble()
    }
}

fun main() {

    val figures = listOf(
        Сircle(
            radius = 33.0, color = "черный",
        ),
        Сircle(
            radius = 35.0, color = "белый",
        ),
        Rectangle(
            width = 20, height = 30, color = "черный",
        ),
        Rectangle(
            width = 25, height = 35, color = "белый",
        ),
    )
    figures.let { it ->
        println("%.2f".format(it.filter { it.color == "черный" }.sumOf { it.calculatePerimeter() }))
        println("%.2f".format(it.filter { it.color == "белый" }.sumOf { it.calculateArea() }))
    }
}