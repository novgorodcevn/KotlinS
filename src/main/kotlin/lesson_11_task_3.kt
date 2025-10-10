class User(
    var nickname: String,
    var status: String = listStatus[1],
)

val listStatus = listOf("разговаривает", "микрофон выключен", "пользователь заглушен")

class Room(
    val cover: String,
    val title: String,
    var listUsers: MutableList<User> = mutableListOf(),
) {
    fun addUsers(user: String) {
        val newsUser = User(nickname = user)
        listUsers.add(newsUser)
    }


    fun updateStatus(name: String, status: String) {
        if (listUsers.find { it.nickname == name } != null && status in listStatus) {
            listUsers.find { it.nickname == name }?.status = status
        } else {
            println("Такого статуса нет или пользователя")
        }
    }
}

fun main() {
    val room = Room(
        cover = "https://example.com/room_cover.jpg",
        title = "посиделки",
        listUsers = mutableListOf(User(nickname = "Петр"), User(nickname = "Федор")),
    )
    room.addUsers("Дима")
    room.addUsers("Илья")
    room.updateStatus("Никита", listStatus[0])
    room.listUsers.forEach { list ->
        println(list.nickname)
        println(list.status)
    }

}
