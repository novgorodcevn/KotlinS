fun main() {
    val symbols: CharRange = ' '..'/'
    val numbers: CharRange = '0'..'9'
    print("Введите длинну пароля:")
    val getPasswordLength = readln().toInt()
    getPassword(symbols, numbers, getPasswordLength)
}

fun getPassword(symbol: CharRange, number: CharRange, length: Int) {
    val password = ""
    for (i in 1..length) {
        if (i % 2 != 0) {
            password + number.random()
        } else {
            password + symbol.random()
        }
    }
    println(password)
}