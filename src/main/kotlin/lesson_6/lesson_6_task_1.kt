package lesson_6

fun main() {
    println("Для начало создайте логин и пароль")
    print("Логин:")
    val userLogin = readln()
    print("пароль:")
    val userPassword = readln()

    do {
        print("Предоставьте свой логин:")
        val checkLogin = readln()
        print("Предоставьте свой пароль:")
        val checkPassword = readln()
    } while (userLogin != checkLogin || userPassword != checkPassword)
    println("Авторизация прошла успешно")
}