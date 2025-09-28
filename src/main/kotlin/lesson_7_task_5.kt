fun main() {
    val rangeNumbers = 0..9
    val rangeLetters = 'a'..'z'
    val rangeUppercaseLetters = 'A'..'Z'
    val generatedPassword = mutableListOf<String>()

    do {
        print("Для генерации пароля введите введите количесво символов(минимальная длинна $MINIMUM_PASSWORD_LENGHT):")
        val userPasswordLength = readln().toIntOrNull()
        if ((userPasswordLength == null) || (userPasswordLength < MINIMUM_PASSWORD_LENGHT)) {
            println("Некоректное значение,попробуйте еще раз")
            continue
        } else for (i in 1..userPasswordLength) {
            val randomSymbol = (1..3).random()
            when (randomSymbol) {
                1 -> {
                    generatedPassword.add(rangeNumbers.random().toString())
                }
                2 -> {
                    generatedPassword.add(rangeLetters.random().toString())
                }
                3 -> {
                    generatedPassword.add(rangeUppercaseLetters.random().toString())
                }
            }
            }
        println(generatedPassword.joinToString(""))
        break
    } while (true)
}

const val MINIMUM_PASSWORD_LENGHT = 6