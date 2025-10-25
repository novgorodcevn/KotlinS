abstract class WeatherStationStats {
    open fun getWeatherStation() {}
}

class Temperature(val temperature: Int) : WeatherStationStats(
) {
    override fun getWeatherStation() {
        println("Погодные условия:температура $temperature")
    }
}

class PrecipitationAmount(val precipitation: Int) : WeatherStationStats() {
    override fun getWeatherStation() {
        println("Погодные условия:количество осадков $precipitation")
    }
}

class WeatherServer {
    fun sendToServer(server: WeatherStationStats) {
        print("на сервер отправлено:")
        when (server) {
            is Temperature -> println("Погодные условия:температура ${server.temperature}")
            is PrecipitationAmount -> println("Погодные условия:количество осадков ${server.precipitation}")
            else -> print("неизвестный тип данных")
        }
    }
}

fun main() {
    val temperature = Temperature(
        temperature = 25
    )
    temperature.getWeatherStation()

    val precipitation = PrecipitationAmount(
        precipitation = 15
    )
    precipitation.getWeatherStation()

    val server = WeatherServer()
    server.sendToServer(server = temperature)
    server.sendToServer(server = precipitation)
}