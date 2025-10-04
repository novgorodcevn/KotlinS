package lesson_7

fun main() {
    print("Введите число:")
    val userAnswer = readln().toInt()
    val evenRange = 0..userAnswer step 2

    for (i in evenRange) {
        println(i)
    }
}