import java.time.LocalDateTime

data class GalacticGuide(
    val name: String,
    val description: String,
    val eventDateTime: LocalDateTime,
    val distanceFromEarth: Double
)

fun main() {
    val alphaCentauri = GalacticGuide(
        name = "Alpha Centauri",
        description = "Ближайшая к Солнцу звездная система",
        eventDateTime = LocalDateTime.of(2024, 6, 1, 12, 0),
        distanceFromEarth = 4.37,
    )
    println("Название: ${alphaCentauri.component1()}")
    println("Описание: ${alphaCentauri.component2()}")
    println("Дата и время события: ${alphaCentauri.component3()}")
    println("Расстояние от Земли: ${alphaCentauri.component4()}")
}