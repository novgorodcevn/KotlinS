package lesson_9

fun main() {
    val ingredientsDish = mutableListOf("помидор", "сыр", "лук")
    println("В рецепте есть базовые ингредиенты:$ingredientsDish")
    println("Желаете добавить еще?")
    val userAnswer = readln()
    if (userAnswer.equals(POSITIVE_RESPONSE, true)) {
        println("Каокой ингредиент вы хотите добавить?")
        val userIngredient = readln()
        ingredientsDish.add(userIngredient)
        println("Теперь в рецепте есть следующие ингредиенты:$ingredientsDish")
    } else {
        return
    }
}

const val POSITIVE_RESPONSE = "да"