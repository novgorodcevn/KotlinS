class Forum(
    var usersForum: MutableList<UserForum> = mutableListOf(),
    var messagesForum: MutableList<MessageForum> = mutableListOf(),
    var generationId: Int = 0,
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

    fun createNewMessage(id: Int) {
        val author = usersForum.find { it.userId == id }
        if (author != null) {
            val newMessage = MessageForum(
                authorId = id,
                message = "привет мир",
            )
            messagesForum.add(newMessage)
        }

    }

    fun printThread() {
        for (i in 1..generationId) {
            val author = usersForum.find { it.userId == i }
            val message = messagesForum.find { it.authorId == i }
            println("${author?.userName}:${message?.message}")
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
    forum.createNewMessage(1)
    forum.createNewMessage(2)
    forum.printThread()
}
