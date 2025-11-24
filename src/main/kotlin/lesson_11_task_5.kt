class Forum(
    private val usersForum: MutableList<UserForum> = mutableListOf(),
    private val messagesForum: MutableList<MessageForum> = mutableListOf(),
    private var generationId: Int = 0,
) {

    fun createNewUser(name: String): UserForum {
        generationId++
        val newUser = UserForum(
            userId = generationId,
            userName = name,
        )
        usersForum.add(newUser)
        return newUser
    }

    fun createNewMessage(id: Int, message: String) {
        val author = usersForum.find { it.userId == id }
        if (author != null) {
            val newMessage = MessageForum(
                authorId = id,
                message = message,
            )
            messagesForum.add(newMessage)
        }
    }

    fun printThread() {
        messagesForum.forEach { message ->
            val author = usersForum.find { it.userId == message.authorId }?.userName
            println("$author:${message.message}")
        }
    }
}

class UserForum(
    val userId: Int,
    val userName: String,
)

class MessageForum(
    val authorId: Int,
    val message: String,
)

fun main() {
    val forum = Forum()
    forum.createNewUser("Dima")
    forum.createNewUser("Ivan")
    forum.createNewMessage(1, "Привет Ivan")
    forum.createNewMessage(1, "Как дела?")
    forum.createNewMessage(2, "Привет Dima")
    forum.createNewMessage(2, "Хорошо спасибо")
    forum.printThread()
}
