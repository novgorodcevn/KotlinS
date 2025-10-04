package lesson_8

fun main() {

    val ingredientsDish = arrayOf("помидор", "сыр", "лук", "честнок", "морковь")

    print("Какой ингредиент вы хотите найти:")
    val userIngredients = readlnOrNull().toString()
    if (userIngredients in ingredientsDish) {
        println("результат: $userIngredients")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}