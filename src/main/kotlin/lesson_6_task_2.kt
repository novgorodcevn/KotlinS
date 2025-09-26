fun main() {
    println("Начало отчета")
    print("Время в секундах:")
    var userAnswer = readln().toInt()
    val timeSecond = userAnswer

    while (userAnswer > 0) {
        userAnswer--
        Thread.sleep(1000)
    }
    println("Прошло $timeSecond секунд")
}