fun main() {
    val isToday = 1
    val analysisGay = (isToday % 2 == 0)

    val muscleGroups = """
        Упражнения для рук:    $analysisGay
        Упражнения для ног:    $analysisGay
        Упражнения для спины:  $analysisGay
        Упражнения для пресса: $analysisGay
    """.trimIndent()
    println(muscleGroups)
}