import kotlin.math.pow

fun main() {
    println("Добро рожаловать в калькулятор ИМТ")
    print("Введите свой вес(в килограммах):")
    val userWight = readln().toDouble()
    print("Введите свой рост(в сантиметрах)")
    val userHeightCentimeters = readln().toDouble()
    val userHeightMeters = userHeightCentimeters / ONE_HUNDRED_CENTIMETERS
    val formulaBMI = userWight / userHeightMeters.pow(2)
    val changedFormat = "%.2f".format(formulaBMI)

    val resultMessage = if (formulaBMI < 18.5) {
        "$changedFormat:Недостаточная масса тела"
    } else if (18.5 <= formulaBMI && formulaBMI < 25) {
        "$changedFormat:Нормальная масса тела"
    } else if (25 <= formulaBMI && formulaBMI < 30) {
        "$changedFormat:Избыточная масса тела"
    } else {
        "Ожирение"
    }
    println(resultMessage)
}

const val ONE_HUNDRED_CENTIMETERS = 100
