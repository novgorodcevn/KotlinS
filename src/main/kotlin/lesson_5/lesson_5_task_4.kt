package lesson_5

fun main() {
    val marvinGreeting = """
    Внимание, пассажир. Моя обязанность, как обычно,
    незавидная, - приветствовать вас на борту корабля
    "Heart of Gold". [вздыхает...] Что ж, введи,
    пожалуйста, свое имя пользователя, чтобы мы могли 
    приступить к процессу входа. Я всегда готов служить, 
    хотя это не приносит мне радости... но вы,
    наверное, об этом не заботитесь. [вздыхает ещё глубже...] 
    Да, вперед, пожалуйста, вводите свои данные...
    """.trimIndent()
    println(marvinGreeting)

    val userName = readln()
    if (userName == USER_NAME) {
        print("Пароль:")
    } else {
        print("Вам нужно зарегестрироваться")
        return
    }
    val userPassword = readln()
    if (userPassword == USER_PASSWORD) {
        val resultMarvin = """
               [вздыхает...] Ваши данные проверены, и о, чудо, они верны...
               Пользователь "Zaphod", вам разрешено входить на борт корабля 
               "Heart of Gold". Хотя мне всё равно... Ну вперед, войдите... 
               Если вам так уж надо, в конце концов... [меланхолический вздох...] 
               Надеюсь, вам понравится пребывание здесь больше, чем мне.
            """.trimIndent()
        println(resultMarvin)
    } else {
        println("Неверный пароль")
    }
}

const val USER_NAME = "Zaphod"
const val USER_PASSWORD = "PanGalactic"