fun main() {

    val isSunny = true
    val isTentOpen = true
    val airHumidity = 20
    val currentSeason = "зима"

    val analysisConditions: Boolean =
        isSunny == SUMMER_WEATHER && isTentOpen == OUTDOOR_AWNING && airHumidity == AIR_HUMIDITY && СURRENT_YEAR != currentSeason
    println("Благоприятные ли условия сейчас для роста бобовых? $analysisConditions")
}

const val SUMMER_WEATHER = true
const val OUTDOOR_AWNING = true
const val AIR_HUMIDITY = 20
const val СURRENT_YEAR = "зима"