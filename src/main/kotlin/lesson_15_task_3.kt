class User(
    private val login: String,
    private val password: String,
) {
    fun verifyPassword(input: String) = password == input
}

fun main() {
    val user = User(
        login = "Nikita",
        password = "123456789"
    )
    println(user.verifyPassword("123456789"))
}