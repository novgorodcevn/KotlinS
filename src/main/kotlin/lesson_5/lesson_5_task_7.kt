package lesson_5

import java.math.RoundingMode
import java.math.BigDecimal

fun main() {
    print("Расстояние поездки (в километрах):")
    val userDistanceKilometers = readln().toDouble()
    print("Расход топлива на 100 км (в литрах):")
    val userFuelConsumption = readln().toDouble()
    print("Текущая цена за литр топлива:")
    val userPricePerLiter = readln().toDouble()

    val fuel = (userDistanceKilometers * userFuelConsumption) / ONE_HUNDRED_KILOMETERS
    val cost = fuel * userPricePerLiter

    val roundingUpFuel = BigDecimal(fuel).setScale(2, RoundingMode.HALF_UP)
    val roundingUpCost = BigDecimal(cost).setScale(2, RoundingMode.HALF_UP)
    println("Общее количество необходимого топлива:$roundingUpFuel")
    println("Итоговую стоимость поездки:$roundingUpCost")
}

const val ONE_HUNDRED_KILOMETERS = 100