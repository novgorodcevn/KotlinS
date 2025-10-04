fun main() {
    val rangeNumbers = '0'..'9'
    val rangeLetters = 'a'..'z'
    val rangeUppercaseLetters = 'A'..'Z'
    val allChars = rangeNumbers + rangeLetters + rangeUppercaseLetters

    println("Для авторизации введите ваши данные.")
    print("Логин:")
    val userLogin = readln()
    print("Пароль:")
    val userPassword = readln()
    println(acceptToken(getToken(userLogin, userPassword, allChars)))

}

const val LOGIN = "Nikita"
const val PASSWORD = "12345"
const val TOKEN_LENGTH = 32

fun getToken(login: String, password: String, char: List<Char>): String {
    val generatedToken = mutableListOf<Char>()
    if (login == LOGIN && password == PASSWORD) {
        for (i in 1..TOKEN_LENGTH) {
            val randomSymbol = char.random()
            generatedToken.add(randomSymbol)
        }
    }
    return generatedToken.joinToString("")
}

fun acceptToken(token: String): String {
    val listOfProducts = mutableListOf("стеральня машинка", "микроволновка", "утюк")
    var verificationResult: String
    if (token != "") {
        verificationResult = "Ваша корзина:${listOfProducts.joinToString(",")}"
    } else {
        verificationResult = "Ошибка"
    }
    return verificationResult
}

