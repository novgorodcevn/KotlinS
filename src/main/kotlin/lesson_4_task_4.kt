fun main() {
    val isToday = 1

    val muscleGroups = """
        Упражнения для рук:    ${isToday % 2 !== 0}
        Упражнения для ног:    ${isToday % 2 == 0}
        Упражнения для спины:  ${isToday % 2 == 0}
        Упражнения для пресса: ${isToday % 2 !== 0}
    """.trimIndent()
    println(muscleGroups)
}