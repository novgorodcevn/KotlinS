fun main() {
    println("Начало отчета")
    print("Время в секундах:")
    var userAnswer = readln().toInt()
    while (userAnswer > 0) {
        println("Осталось секунд:${userAnswer--}")
        Thread.sleep(1000)
    }
    println("Время вышло")
}