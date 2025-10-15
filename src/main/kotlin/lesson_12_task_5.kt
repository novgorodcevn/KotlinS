import kotlin.random.Random

class Weather5(
    val dayTimeTemperature: Int,
    val nightTemperature: Int,
    val precipitationAvailability: Boolean
)

fun main() {
    val weatherMonth = mutableListOf<Weather5>()

    for (i in 1..DAY_MONTH) {
        val weather = Weather5(
            dayTimeTemperature = (0..90).random(),
            nightTemperature = (0..90).random(),
            precipitationAvailability = Random.nextBoolean()
        )
        weatherMonth.add(weather)
    }
    val dayTimeTemperatureMonth = weatherMonth.map { it.dayTimeTemperature }.average()
    val nightTemperatureMonth = weatherMonth.map { it.nightTemperature }.average()
    var amountPrecipitation = 0

    weatherMonth.forEach { day ->
        if (day.precipitationAvailability == true) {
            amountPrecipitation++
        }
    }

    println("%.2f".format(dayTimeTemperatureMonth))
    println("%.2f".format(nightTemperatureMonth))
    println(amountPrecipitation)
}

const val DAY_MONTH = 30