package lesson_2

fun main() {
    val initialAmount = 70_000
    val annualInterestRate = 16.7
    val years = 20
    val countPeriods = 1
    val maxPercent = 100

    val compoundInterest = initialAmount.toDouble() * Math.pow(
        countPeriods + (annualInterestRate / maxPercent) / countPeriods,
        (countPeriods * years).toDouble()
    )
    println(String.format("%.3f", compoundInterest))
}