fun main() {

    print("Введите секунды,для начало отчета:")
    val userAnswer = readln().toInt()

    for (i in userAnswer downTo 0) {
        println("До конца осталось $i секунд")
        Thread.sleep(1000)
    }
    println("Время вышло")
}