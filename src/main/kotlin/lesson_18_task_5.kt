open class Screen(
   private val name: String,
) {
    fun draw(
        x: Int,
        y: Int,
    ){
        println("Фигура $name нарисована с кординатомами $x и $y")
    }

    fun draw(
        x: Float,
        y: Float,
    ){
      println("Фигура $name нарисована с кординатомами $x и $y")
    }

}

class Circle(
    name: String = "Круг"
):Screen(name)

class Square(
    name: String = "Квадрат"
):Screen(name)

class Dot(
    name: String = "Точка"
):Screen(name)

fun main() {
    val circle = Circle()
    circle.draw(x = 5.75F, y = 5.75F)
   }