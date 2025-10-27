class User(
    val login: String,
    val password: String,
) {
    private val correctPassword = "123456789"

    fun verifyPassword() = password == correctPassword
}

fun main() {
    val user = User(
        login = "Nikita",
        password = "123456789"
    )
    println(user.verifyPassword())
}