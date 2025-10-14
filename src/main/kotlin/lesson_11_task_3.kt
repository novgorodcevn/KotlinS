val listStatus = listOf("разговаривает", "микрофон выключен", "пользователь заглушен")

class User(
    val avatarUrl: String,
    val nickname: String,
    var status: String = listStatus[1],
)

class Room(
    val cover: String,
    val title: String,
    val participants: MutableList<User> = mutableListOf(),
) {

    fun addUser(user: User) {
        participants.add(user)
    }

    fun updateStatus(name: String, status: String) {
        val user = participants.find { it.nickname == name }
        if (user != null && status in listStatus) {
            user.status = status
        } else {
            println("Такого статуса нет или пользователя")
        }
    }
}

fun main() {
    val room = Room(
        cover = "https://example.com/room_cover.jpg",
        title = "посиделки",
        participants = mutableListOf(
            User(nickname = "Петр", avatarUrl = "https://example.com/петр.jpg"),
            User(nickname = "Федор", avatarUrl = "https://example.com/федор.jpg")
        ),
    )
    val newUser = User(
        avatarUrl = "https://example.com/mark.jpg",
        nickname = "Mark",
        status = listStatus[2]
    )
    val newUser2 = User(
        avatarUrl = "https://example.com/bob.jpg",
        nickname = "Bob",
        status = listStatus[0]
    )
    room.addUser(newUser)
    room.addUser(newUser2)
    room.updateStatus("Петр", listStatus[0])

    room.participants.forEach { user ->
        println(user.nickname)
        println(user.status)
    }
}