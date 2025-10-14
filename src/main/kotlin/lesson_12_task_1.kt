class Weather() {
    var dayTimeTemperature = 15
    var nightTemperature = 20
    var precipitationAvailability = true

    fun getWeather() {
        println("дневная температура=$dayTimeTemperature")
        println("ночная температура=$nightTemperature")
        println("осадки=$precipitationAvailability")
    }
}

fun main() {

    val monday = Weather()
    monday.dayTimeTemperature = 13
    monday.nightTemperature = 18
    monday.precipitationAvailability = false
    monday.getWeather()

    val tuesday = Weather()
    tuesday.dayTimeTemperature = 17
    tuesday.nightTemperature = 21
    tuesday.precipitationAvailability = true
    tuesday.getWeather()
}