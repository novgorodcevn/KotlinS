fun main(){
      val departureHour = 9
      val departureMinute = 39
      val travelTimeMinute = 457

      val arrivalInMinutes = departureHour*MINUTE_IN_A_HOUR+departureMinute+travelTimeMinute
      val hourFormat = arrivalInMinutes/MINUTE_IN_A_HOUR
      val minuteFormat = arrivalInMinutes%MINUTE_IN_A_HOUR
      println("$hourFormat:$minuteFormat")
}
const val MINUTE_IN_A_HOUR = 60