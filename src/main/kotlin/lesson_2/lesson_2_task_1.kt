package lesson_2

fun main() {
    var studentScores1 = 3
    var studentScores2 = 4
    var studentScores3 = 3
    var studentScores4 = 5
    var countStudents = 4

    var sum = studentScores1 + studentScores2 + studentScores3 + studentScores4
    var averageScore = sum.toFloat() / countStudents
    println(averageScore)
}