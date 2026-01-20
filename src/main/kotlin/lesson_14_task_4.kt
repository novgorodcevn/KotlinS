abstract class CelestialBodies(
    val name: String,
    val atmosphere: Boolean,
    val suitabilityDisembarkation: Boolean,
)

class Planet(
    name: String,
    atmosphere: Boolean,
    suitabilityDisembarkation: Boolean,
    val satellites: List<Satellite>,
) :
    CelestialBodies(name, atmosphere, suitabilityDisembarkation)

class Satellite(
    name: String,
    atmosphere: Boolean,
    suitabilityDisembarkation: Boolean,
) :
    CelestialBodies(name, atmosphere, suitabilityDisembarkation)

fun main() {

    val planet = Planet(
        name = "Сатурн",
        atmosphere = true,
        suitabilityDisembarkation = false,
        satellites = listOf(
            Satellite(
                name = "Титан",
                atmosphere = true,
                suitabilityDisembarkation = false
            ),
            Satellite(
                name = "Мимас",
                atmosphere = true,
                suitabilityDisembarkation = false
            ),
            )
    )
    planet.let { it->
        println("Планета:${it.name}")
        println("Спутники:${it.satellites.joinToString(",") { it.name }}")
    }
}