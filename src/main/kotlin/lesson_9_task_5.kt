fun main() {
    println("Напишите по отдельности пять инредиентов")
    val ingredients = mutableListOf<String>()
    for (i in 1..MAX_INGREDIENTS) {
        val userIngredients = readln()
        ingredients.add(userIngredients)
    }
    val sortedIngredients = ingredients.toSet().sorted()
    println(sortedIngredients.joinToString(",").capitalize())
}

const val MAX_INGREDIENTS = 5