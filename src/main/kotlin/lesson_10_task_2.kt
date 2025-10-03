fun main() {
    println("Введите логин и пароль по очереди:")
    println("Пароль и логин должны содержать не менее 4 символов")
    val userLogin = readln()
    val userPassword = readln()
    println(getCheckValidation(userLogin, userPassword))
}

fun getCheckValidation(login: String, password: String): String {
    val resultValidation: String =
        if (login.length > MINIMUM_NUMBER_OF_CHARACTERS &&
            password.length > MINIMUM_NUMBER_OF_CHARACTERS
        ) {
            "Добро пожаловать!"
        } else {
            "Логин или пароль недостаточно длинные"
        }
    return resultValidation
}

const val MINIMUM_NUMBER_OF_CHARACTERS = 4