package lesson_1

const val SECONDS_IN_AN_HOUR = 3600
const val SECONDS_IN_A_MINUTE = 60
fun main() {
    val timeInSpace: Short = 6480
    var time = timeInSpace / SECONDS_IN_AN_HOUR
    var minutes = timeInSpace % SECONDS_IN_AN_HOUR / SECONDS_IN_A_MINUTE
    var seconds = timeInSpace % SECONDS_IN_AN_HOUR % SECONDS_IN_A_MINUTE
    var resultTime = String.format("%02d:%02d:%02d", time, minutes, seconds)
    println(resultTime)
}






