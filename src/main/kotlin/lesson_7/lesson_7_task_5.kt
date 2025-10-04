package lesson_7

fun main() {
    val rangeNumbers = '0'..'9'
    val rangeLetters = 'a'..'z'
    val rangeUppercaseLetters = 'A'..'Z'
    val generatedPassword = mutableListOf<Char>()
    val allChars = rangeNumbers + rangeLetters + rangeUppercaseLetters

    do {
        print("Для генерации пароля введите введите количесво символов(минимальная длинна $MINIMUM_PASSWORD_LENGTH):")
        val userPasswordLength = readln().toIntOrNull()
        if (userPasswordLength != null && userPasswordLength >= MINIMUM_PASSWORD_LENGTH) {
            generatedPassword.add(rangeNumbers.random())
            generatedPassword.add(rangeLetters.random())
            generatedPassword.add(rangeUppercaseLetters.random())

            for (i in 1..userPasswordLength - 3) {
                val randomSymbol = allChars.random()
                generatedPassword.add(randomSymbol)
            }
            generatedPassword.shuffle()
            println(generatedPassword.joinToString(""))
        } else {
            println("Некоректное значение,попробуйте еще раз")
        }
    } while (userPasswordLength == null || userPasswordLength < MINIMUM_PASSWORD_LENGTH)
}

const val MINIMUM_PASSWORD_LENGTH = 6