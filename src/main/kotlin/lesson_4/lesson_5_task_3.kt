package lesson_4

fun main() {
    val correctNumber1 = (0..42).random()
    val correctNumber2 = (0..42).random()

    println("Добро пожаловать в игру 'Лотерея'")
    print("Введите первое число от (0..42):")
    val userAnswer1 = readln().toInt()
    print("Введите второе число от (0..42):")
    val userAnswer2 = readln().toInt()

    val isFirstNumberGuessed = (userAnswer1 == correctNumber1) || (userAnswer1 == correctNumber2)
    val isSecondNumberGuessed = (userAnswer2 == correctNumber1) || (userAnswer2 == correctNumber2)

    val resultMessage =
        if (isFirstNumberGuessed && isSecondNumberGuessed) {
            "Поздравляем! Вы выиграли главный приз!"
        } else if (isFirstNumberGuessed || isSecondNumberGuessed) {
            "Вы выиграли утешительный приз!"
        } else {
            "Неудача!"
        }
    println(resultMessage)
    println("Для победы нужны числа $correctNumber1 и $correctNumber2")
}