fun main() {
    println("Напишите ингредиенты через запятую и пробел")
    val userIngredients = readln().split(", ")

    val listIngredients:List<String> = userIngredients
    val sortedlistIngredients = listIngredients.sorted()

    println(sortedlistIngredients)
}