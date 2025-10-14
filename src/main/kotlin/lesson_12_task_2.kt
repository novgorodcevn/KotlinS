class Weather2(
    private var dayTimeTemperature: Int,
    private var nightTemperature: Int,
    private var precipitationAvailability: Boolean
) {

    fun getWeather() {
        println("дневная температура=$dayTimeTemperature")
        println("ночная температура=$nightTemperature")
        println("осадки=$precipitationAvailability")
    }
}

fun main() {

    val monday = Weather2(
        dayTimeTemperature = 13,
        nightTemperature = 18,
        precipitationAvailability = false
    )
    monday.getWeather()

    val tuesday = Weather2(
        dayTimeTemperature = 17,
        nightTemperature = 21,
        precipitationAvailability = true
    )
    tuesday.getWeather()
}