fun main() {
    val rangeNumbers = '0'..'9'
    val rangeLetters = 'a'..'z'
    val rangeUppercaseLetters = 'A'..'Z'
    val generatedPassword = mutableListOf<Char>()
    val unifiedSymbols =
        mutableListOf(rangeNumbers, rangeLetters, rangeUppercaseLetters)

    do {
        print("Для генерации пароля введите введите количесво символов(минимальная длинна $MINIMUM_PASSWORD_LENGTH):")
        val userPasswordLength = readln().toIntOrNull()
        if (userPasswordLength != null && userPasswordLength >= MINIMUM_PASSWORD_LENGTH) {
            generatedPassword.add(rangeNumbers.random())
            generatedPassword.add(rangeLetters.random())
            generatedPassword.add(rangeUppercaseLetters.random())

            for (i in 1..userPasswordLength - 3) {
                val randomSymbol = unifiedSymbols.random()
                generatedPassword.add(randomSymbol.random())
            }
        } else {
            println("Некоректное значение,попробуйте еще раз")
        }
        generatedPassword.shuffle()
        println(generatedPassword.joinToString(""))
    } while (userPasswordLength == null || userPasswordLength < MINIMUM_PASSWORD_LENGTH)
}

const val MINIMUM_PASSWORD_LENGTH = 6