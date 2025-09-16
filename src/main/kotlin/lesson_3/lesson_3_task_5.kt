package lesson_3

fun main() {
    val blackMove = "D2-D4;0"

    val whereFrom = "${blackMove[0]}${blackMove[1]}"
    val whereTo = "${blackMove[3]}${blackMove[4]}"
    val moveNumber = "${blackMove[6]}"
    println(whereFrom)
    println(whereTo)
    println(moveNumber)
}