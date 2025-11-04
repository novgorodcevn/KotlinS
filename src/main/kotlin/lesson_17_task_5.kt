class User(
    login: String,
    private var _password: String,
) {
    private fun hiddenPassword(): String {
        var hiddenPassword = ""
        for (i in 1.._password.length) {
            hiddenPassword += "*"
        }
        return hiddenPassword
    }

    var login: String = login
        get() = field
        set(value) {
            field = value
            println("Логин успешно изменен")
        }
    var password: String = hiddenPassword()
        get() = field
        set(value) {
            println("Вы не можете изменить пароль")
        }

}

fun main() {
    val user = User(
        login = "Nik",
        _password = "1234"
    )
    println(user.login)
    user.login = "Ник"
    println(user.login)
    println(user.password)
    user.password = "dasdas"
}

