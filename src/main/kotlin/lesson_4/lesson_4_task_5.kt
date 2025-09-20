package lesson_4

fun main() {
    print("Наличие повреждений корпуса (true/false): ")
    val damage = readln().toBoolean()
    print("Текущий состав экипажа: ")
    val countCrew = readln().toInt()
    print("Количество ящиков с провизией на борту: ")
    val boxProvisions = readln().toInt()
    print("Благоприятность метеоусловий (true/false): ")
    val weather = readln().toBoolean()
    val settingSail =
        (damage !== YES_DAMAGE && countCrew in MIN_CREW..MAX_CREW && boxProvisions > MAX_PROVISIONS && (weather == FAVORABLE || weather == UNFAVORABLE))
                || (damage == YES_DAMAGE && countCrew == MAX_CREW && weather == FAVORABLE && boxProvisions >= MAX_PROVISIONS)
    println(settingSail)
}

const val YES_DAMAGE = true
const val MIN_CREW = 55
const val MAX_CREW = 70
const val MAX_PROVISIONS = 50
const val FAVORABLE = true
const val UNFAVORABLE = false