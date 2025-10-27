abstract class WeatherStationStats
class Temperature(val temperature: Int) : WeatherStationStats()

class PrecipitationAmount(val precipitation: Int) : WeatherStationStats()

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

    val precipitation = PrecipitationAmount(
        precipitation = 15
    )

    val server = WeatherServer()
    server.sendToServer(server = temperature)
    server.sendToServer(server = precipitation)
}