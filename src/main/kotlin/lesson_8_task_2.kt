fun main() {

    val ingredientsDish = arrayOf("помидор", "сыр", "лук", "честнок", "морковь")
    print("Какой ингредиент вы хотите найти:")
    val userIngredients = readlnOrNull()

    for (i in ingredientsDish) {
        if (i == userIngredients) {
        println("Ингредиент $i в рецепте есть")
            return
        }
    }
    println("Такого ингредиента в рецепте нет")
}