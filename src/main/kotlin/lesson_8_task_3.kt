fun main() {

    val ingredientsDish = arrayOf("помидор", "сыр", "лук", "честнок", "морковь")

    print("Какой ингредиент вы хотите найти:")
    val userIngredients = readlnOrNull().toString()
    val arrayUserIngredients = arrayOf(userIngredients)
    val comparisonResult = ingredientsDish.intersect(arrayUserIngredients.toSet()).size
    if (comparisonResult == 0) {
        println("Такого ингредиента в рецепте нет")
    } else {
        println("результат: $userIngredients")
    }
}