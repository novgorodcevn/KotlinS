fun main() {

    val ingredientsDish = arrayOf("помидор", "сыр", "лук", "честнок", "морковь")
    println(ingredientsDish.joinToString(" "))
    print("Какой ингредиент вы хотите заменить:")
    val changeIngredient = readlnOrNull().toString()
    if (changeIngredient in ingredientsDish) {
        print("Какой ингредиент вы хотите добавить:")
        val newIngredient = readlnOrNull().toString()
        val changedIndex = ingredientsDish.indexOf(changeIngredient)
        ingredientsDish[changedIndex] = newIngredient
        println(ingredientsDish.joinToString(" "))
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}