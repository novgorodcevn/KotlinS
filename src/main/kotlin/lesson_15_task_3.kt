abstract class User(
    val name: String,

){
    abstract fun readForum()
    abstract fun writeMessage(text: String)
}

class AverageUser(name: String,
    ):User(name){
    override fun readForum() {
       println("Пользователь $name читает форум")
    }

    override fun writeMessage(text: String) {
       println("Пользователь $name написал сообщение:$text")
    }

}

class Administrator(name: String,):User(name){
    override fun readForum() {
        println("Администратор $name читает форум")
    }

    override fun writeMessage(text: String) {
        println("Администратор $name написал сообщение:$text")
    }

    fun deleteUser(user:AverageUser) {
        println("Администратор $name удолил пользователя ${user.name}")
    }

    fun deleteMessage(user:AverageUser) {
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