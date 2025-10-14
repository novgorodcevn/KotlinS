class Weather2(
    dayTimeKelvins: Int,
    nightKelvins: Int,
) {
    val dayTimeCelsius = dayTimeKelvins - minTemperatureCelsius
    val nightCelsius = nightKelvins - minTemperatureCelsius

    fun getWeather() {
        println("дневная температура=${"%.2f".format(dayTimeCelsius)}")
        println("ночная температура=${"%.2f".format(nightCelsius)}")

    }
}

const val minTemperatureCelsius = 273.15

fun main() {

    val monday = Weather2(
        dayTimeKelvins = 13,
        nightKelvins = 18,

        )
    monday.getWeather()

    val tuesday = Weather2(
        dayTimeKelvins = 17,
        nightKelvins = 21,

        )
    tuesday.getWeather()
}