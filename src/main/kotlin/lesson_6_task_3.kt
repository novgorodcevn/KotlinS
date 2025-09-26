fun main() {
    println("Начало отчета")
    print("Время в секундах:")
    var secondsLeft = readln().toInt()

    while (secondsLeft > 0) {
        println("Осталось секунд:$secondsLeft")
        secondsLeft--
        Thread.sleep(1000)
    }
    println("Время вышло")
}