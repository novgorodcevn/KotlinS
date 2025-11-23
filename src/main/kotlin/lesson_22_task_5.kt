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
    val (name, description, eventDateTime, distance) = alphaCentauri

    println("Название: $name")
    println("Описание: $description")
    println("Дата и время события: $eventDateTime")
    println("Расстояние от Земли: $distance световых лет")
}