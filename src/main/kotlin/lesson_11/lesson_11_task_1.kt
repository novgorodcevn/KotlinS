package lesson_11

class User(
    val id: Int,
    val login: String,
    val password: String,
    val mail: String
)

fun main() {

    val Fedor = User(
        1,
        "fedor994",
        "1234",
        "fedor@gmail.com"
    )

    val Ivan = User(
        2,
        "ivan228",
        "zxcv1234",
        "vanya992@gmail.com"
    )

    println(Fedor.id)
    println(Fedor.login)
    println(Fedor.password)
    println(Fedor.mail)
    println()
    println(Ivan.id)
    println(Ivan.login)
    println(Ivan.password)
    println(Ivan.mail)
}