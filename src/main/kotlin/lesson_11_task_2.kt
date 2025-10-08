class User2(
    val id: Int,
    val login: String,
    var password: String,
    val mail: String,
    var bio: String? = null
) {
    fun getUserInformation() {
        val userInformation = """
           $id
           $login
           $password
           $mail
           $bio
       """.trimIndent()
        println(userInformation)
    }

    fun writeFieldBio() {
        println("Заполните информацмю о себе:")
        val userAnswerBio = readln()
        bio = userAnswerBio
    }

    fun changeThePassword() {
        val currentPassword = password
        print("Введите текущий пароль:")
        val userCurrentPassword = readln()
        if (currentPassword == userCurrentPassword) {
            println("Введите новый пароль")
            val userNewPassword = readln()
            password = userNewPassword
            println("Пароль изменен")
        } else {
            println("Пароль не правильный")
        }
    }
}

fun main() {
    val fedor = User2(
        id = 1,
        login = "fedor994",
        password = "1234",
        mail = "fedor@gmail.com"
    )
    fedor.writeFieldBio()
    fedor.changeThePassword()
    fedor.getUserInformation()
}