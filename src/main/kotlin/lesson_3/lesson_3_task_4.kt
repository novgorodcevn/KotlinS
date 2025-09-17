package lesson_3

fun main() {
    var whereFrom = "E2"
    var whereTo = "E4"
    var moveNumber = 1

    val blackMove = "$whereFrom-$whereTo;$moveNumber"
    println(blackMove)

    whereFrom = "D2"
    whereTo = "D3"
    moveNumber = 2

    val whiteMove = "$whereFrom-$whereTo;$moveNumber"
    println(whiteMove)
}