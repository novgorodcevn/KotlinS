fun Map<String, Int>.maxCategory(): String? {
    return this.maxByOrNull { it.value }?.key
}

fun main() {
    val skills = mapOf("Archery" to 30, "Magic" to 50, "Stealth" to 50, "Sword" to 40)
    val topSkill = skills.maxCategory()
    println(topSkill)
}