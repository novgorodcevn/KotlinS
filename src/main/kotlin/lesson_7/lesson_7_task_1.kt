package lesson_7

fun main() {
    val passwordGeneration = mutableListOf<String>()

    for (i in 1..NUMBER_OF_CHARACTERS) {
        val symbol = ('a'..'z').random().toString()
        val number = (0..9).random().toString()
        passwordGeneration.add(symbol)
        passwordGeneration.add(number)
    }
    val singlePassword = listOf(passwordGeneration.joinToString (""))
    println(singlePassword)
}

const val NUMBER_OF_CHARACTERS = 3