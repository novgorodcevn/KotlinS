package lesson_1

fun main() {
    var seconds: Short = 6480
    timeSpentInSpace(seconds)

}
   fun timeSpentInSpace(seconds:Short):String{
       var time = seconds/3600
       var minutes = seconds%3600/60
       var seconds = seconds%3600%60
       var resultTime = String.format("%02d:%02d:%02d",time,minutes,seconds)
       return println(resultTime).toString()
   }