class ProcessingPoint(
    private val packageNumber: Int,
    private var _location: String,
) {
    var movementCounter = 0
        private set

    var location: String
        get() = _location
        set(value) {
            _location = value
            movementCounter++
        }
}

fun main() {

    val point = ProcessingPoint(
        packageNumber = 1,
        _location = "Казань"
    )

    println(point.movementCounter)
    point.location = "Москва"
    println(point.movementCounter)
    println(point.location)
}