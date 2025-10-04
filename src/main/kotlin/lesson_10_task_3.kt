fun main() {
    val symbols: CharRange = ' '..'/'
    val numbers: CharRange = '0'..'9'
    print("Введите длинну пароля:")
    val getPasswordLength = readln().toInt()
    getPassword(symbols, numbers, getPasswordLength)
}

fun getPassword(symbol: CharRange, number: CharRange, length: Int) {
    val password = mutableListOf<Char>()
    for (i in 1..length) {
        if (i % 2 != 0) {
            password.add(number.random())
        } else {
            password.add(symbol.random())
        }
    }
    println(password.joinToString(""))
}