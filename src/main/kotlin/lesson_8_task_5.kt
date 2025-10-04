fun main() {
    println("сколько ингедиентов вы хотите добавить?")
    val numberIngredients = readln().toInt()
    println("Введите ингредиенты по череди")
    val arrayOfIngredients = Array(numberIngredients) { "" }

    for (i in 0 until numberIngredients) {
        val userIngredients = readln()
        arrayOfIngredients[i] = userIngredients
    }
    println(arrayOfIngredients.joinToString(","))
}