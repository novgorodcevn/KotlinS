abstract class User(
    val name: String,
) {
    fun readForum() {
        println("Пользователь $name читает форум")
    }

    fun writeMessage(text: String) {
        println("Пользователь $name написал сообщение:$text")
    }
}

class AverageUser(name: String) : User(name)

class Administrator(name: String) : User(name) {

    fun deleteUser(user: User) {
        println("Администратор $name удолил пользователя ${user.name}")
    }

    fun deleteMessage(user: AverageUser) {
        println("Администратор $name удолил собщение пользователя: ${user.name}")
    }
}

fun main() {
    val user = AverageUser(name = "Леха")
    user.readForum()
    user.writeMessage("Вышло обновление Kotlin")

    val administrator = Administrator(name = "Сергей")
    administrator.readForum()
    administrator.writeMessage("Уточните дату вызода обновления")
    administrator.deleteUser(user)
    administrator.deleteMessage(user)
}