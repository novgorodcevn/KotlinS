fun main() {
    val isToday = 1
    val evenDay = (isToday % 2 == 0)
    val oddDay = (isToday % 2 !== 0)

    val muscleGroups = """
        Упражнения для рук:    $oddDay
        Упражнения для ног:    $evenDay
        Упражнения для спины:  $evenDay
        Упражнения для пресса: $oddDay
    """.trimIndent()
    println(muscleGroups)
}