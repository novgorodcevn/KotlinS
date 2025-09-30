fun main() {
    val rangeNumbers = 0..9
    val rangeLetters = 'a'..'z'
    val rangeUppercaseLetters = 'A'..'Z'
    val generatedPassword = mutableListOf<Char>()

    do {
        print("Для генерации пароля введите введите количесво символов(минимальная длинна $MINIMUM_PASSWORD_LENGTH):")
        val userPasswordLength = readln().toIntOrNull()
        if (userPasswordLength == null || userPasswordLength < MINIMUM_PASSWORD_LENGTH) {
            println("Некоректное значение,попробуйте еще раз")
            continue
        } else {
            generatedPassword.add(rangeNumbers.random().toChar())
            generatedPassword.add(rangeLetters.random())
            generatedPassword.add(rangeUppercaseLetters.random())
            for (i in 1..userPasswordLength - 3) {
                val randomSymbol = (1..3).random()
                when (randomSymbol) {
                    1 -> {
                        generatedPassword.add(rangeNumbers.random().toChar())
                    }
                    2 -> {
                        generatedPassword.add(rangeLetters.random())
                    }
                    3 -> {
                        generatedPassword.add(rangeUppercaseLetters.random())
                    }
                }
            }
            generatedPassword.shuffle()
            println(generatedPassword.joinToString(""))
        }
    } while (userPasswordLength == null || userPasswordLength < MINIMUM_PASSWORD_LENGTH)
}

const val MINIMUM_PASSWORD_LENGTH = 6