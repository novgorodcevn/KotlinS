class PostalParcel(
    private val packageNumber: Int,
    initialLocation: String,
) {
    var movementCounter = 0
        private set

    var location: String = initialLocation
        get() = field
        set(value) {
            field = value
            movementCounter++
        }
}

fun main() {

    val point = PostalParcel(
        packageNumber = 1,
        initialLocation = "Казань"
    )

    println(point.movementCounter)
    point.location = "Москва"
    println(point.movementCounter)
    println(point.location)
}