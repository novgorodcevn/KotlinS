data class User(val id: Int, val age: Int, val name: String)

fun main() {
    val user = User(id = 1, age = 18, name = "Боб")
    val (userId, userAge, userName) = user
    println("id = $userId")
    println("age = $userAge")
    println("name = $userName")
}