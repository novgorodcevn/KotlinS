package lesson_2

fun main() {
    val buff = 20
    val crystalOre = 7
    val ironOre = 11
    val maxPercent = 100

    val bonusCrystal = (buff * crystalOre) / maxPercent
    println(bonusCrystal)
    val bonusIron = (buff * ironOre) / maxPercent
    println(bonusIron)
}