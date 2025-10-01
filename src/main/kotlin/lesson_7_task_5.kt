fun main() {
    val rangeNumbers = '0'..'9'
    val rangeLetters = 'a'..'z'
    val rangeUppercaseLetters = 'A'..'Z'
    val generatedPassword = mutableListOf<Char>()

    do {
        print("Для генерации пароля введите введите количесво символов(минимальная длинна $MINIMUM_PASSWORD_LENGTH):")
        val userPasswordLength = readln().toIntOrNull()
        val checkPasswordLength = userPasswordLength == null
        if (userPasswordLength == null || userPasswordLength < MINIMUM_PASSWORD_LENGTH) {
            println("Некоректное значение,попробуйте еще раз")
            continue
        } else {
            generatedPassword.add(rangeNumbers.random())
            generatedPassword.add(rangeLetters.random())
            generatedPassword.add(rangeUppercaseLetters.random())
            for (i in 1..userPasswordLength - 3) {
                val unifiedSymbols =
                    mutableListOf(rangeNumbers.random(), rangeLetters.random(), rangeUppercaseLetters.random())
                val randomSymbol = (unifiedSymbols).random()
                generatedPassword.add(randomSymbol)
            }
        }
        generatedPassword.shuffle()
        println(generatedPassword.joinToString(""))
    } while (checkPasswordLength)
}

const val MINIMUM_PASSWORD_LENGTH = 6