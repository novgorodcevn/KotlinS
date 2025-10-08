package lesson_11

class User(
    val id: Int,
    val login: String,
    val password: String,
    val mail: String
)

fun main() {
    val fedor = User(
        id = 1,
        login = "fedor994",
        password = "1234",
        mail = "fedor@gmail.com"
    )
    val ivan = User(
        id = 2,
        login = "ivan228",
        password = "zxcv1234",
        mail = "vanya992@gmail.com"
    )
    println(fedor.id)
    println(fedor.login)
    println(fedor.password)
    println(fedor.mail)
    println()
    println(ivan.id)
    println(ivan.login)
    println(ivan.password)
    println(ivan.mail)
}