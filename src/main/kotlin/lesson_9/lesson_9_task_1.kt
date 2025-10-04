package lesson_9

fun main() {
    val ingredientsDish = listOf("помидор", "сыр", "лук", "честнок", "морковь")
    println("В рецепте еть следующие ингредиенты:")
    ingredientsDish.forEach {
        println(it)
    }
}