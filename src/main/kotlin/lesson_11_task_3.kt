class User(
    val avatarUrl: String,
    var nickname: String,
    var status: String = listStatus[1],
)

val listStatus = listOf("разговаривает", "микрофон выключен", "пользователь заглушен")

class Room(
    val cover: String,
    val title: String,
    var participants: MutableList<User> = mutableListOf(),
) {
    fun addUsers(user: User) {
        participants.add(user)
    }
    fun updateStatus(name: String, status: String) {
        val findUser = participants.find { it.nickname == name }
        if (findUser != null && status in listStatus) {
            findUser.status = status
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
    room.addUsers(newUser)
    room.addUsers(newUser2)
    room.updateStatus("Петр", listStatus[0])

    room.participants.forEach { user ->
        println(user.nickname)
        println(user.status)
    }
}