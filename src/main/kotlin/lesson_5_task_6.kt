import kotlin.math.pow

fun main() {
    println("Добро рожаловать в калькулятор ИМТ")
    print("Введите свой вес(в килограммах):")
    val userWight = readln().toDouble()
    print("Введите свой рост(в сантиметрах)")
    val userHeightCentimeters = readln().toDouble()
    val userHeightMeters = userHeightCentimeters / ONE_HUNDRED_CENTIMETERS
    val bmi = userWight / userHeightMeters.pow(2)
    val formattedBmi = "%.2f".format(bmi)

    val resultMessage = when {
        bmi < MINIMUM_BODY_WEIGHT -> "$formattedBmi:Недостаточная масса тела"
        bmi < NORMAL_BODY_WEIGHT -> "$formattedBmi:Нормальная масса тела"
        bmi < MAXIMUM_BODY_WEIGHT -> "$formattedBmi:Избыточная масса тела"
        else -> "$formattedBmi:Ожирение"
    }
    println(resultMessage)
}

const val MINIMUM_BODY_WEIGHT = 18.5
const val NORMAL_BODY_WEIGHT = 25
const val MAXIMUM_BODY_WEIGHT = 30
const val ONE_HUNDRED_CENTIMETERS = 100