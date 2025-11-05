class User(
    login: String,
    private var _password: String,
) {
    var login: String = login
        get() = field
        set(value) {
            field = value
            println("Логин успешно изменен")
        }
    var password: String
        get() = "*".repeat(_password.length)
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

