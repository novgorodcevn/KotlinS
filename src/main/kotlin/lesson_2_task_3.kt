fun main() {
    val departureHour = 9
    val departureMinute = 39
    val travelTimeMinute = 457

    val arrivalInMinutes = departureHour * MINUTE_IN_A_HOUR + departureMinute + travelTimeMinute
    val arrivalHour = arrivalInMinutes / MINUTE_IN_A_HOUR
    val arrivalMinute = arrivalInMinutes % MINUTE_IN_A_HOUR
    println(String.format("%02d:%02d", arrivalHour, arrivalMinute))
}

const val MINUTE_IN_A_HOUR = 60