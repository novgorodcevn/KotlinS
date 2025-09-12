package lesson_2

import kotlin.math.pow

fun main() {
    val initialAmount = 70_000
    val annualInterestRate = 16.7
    val years = 20
    val countPeriods = 1
    val maxPercent = 100

    val compoundInterest = initialAmount.toDouble() * (countPeriods + (annualInterestRate / maxPercent) / countPeriods).pow(
        (countPeriods * years).toDouble()
    )
    println("%.3f".format( compoundInterest))
}