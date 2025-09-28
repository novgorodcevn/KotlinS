fun main() {
    print("Введите число:")
    val userAnswer = readln().toInt()
    val userNumber = userAnswer
    val evenRange = 0..userNumber step 2

    for (i in evenRange)
        println(i)
}