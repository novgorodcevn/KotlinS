fun main() {
    val blackMove = "D2-D4;0".split("-", ";")

    val whereFrom = blackMove[0]
    val whereTo = blackMove[1]
    val moveNumber = blackMove[2]
    println(whereFrom)
    println(whereTo)
    println(moveNumber)
}