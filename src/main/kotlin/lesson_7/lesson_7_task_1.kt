package lesson_7

fun main() {
    val passwordGeneration = mutableListOf<String>()
    val symbol = ('a'..'z')
    val number = (0..9)
    for (i in 1..NUMBER_OF_CHARACTERS_PAIRS) {
        passwordGeneration.add(symbol.random().toString())
        passwordGeneration.add(number.random().toString())
    }
    println(passwordGeneration.joinToString (""))
}

const val NUMBER_OF_CHARACTERS_PAIRS = 3