package lesson_1

const val SECONDS_IN_AN_HOUR = 3600
const val SECONDS_IN_A_MINUTE = 60
fun main() {
    val timeInSpace: Short = 6480
    val time = timeInSpace / SECONDS_IN_AN_HOUR
    val minutes = timeInSpace % SECONDS_IN_AN_HOUR / SECONDS_IN_A_MINUTE
    val seconds = 0
  //  val resultTime = String.format("%02d:%02d:%02d", time, minutes, seconds)
    println("%02d:%02d:%02d".format(time, minutes, seconds))
}






