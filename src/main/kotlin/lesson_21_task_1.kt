fun String.vowelCount(): Int {
    val vowels = "aeiouAEIOU"
    return this.count { it in vowels }
}

fun main() {
    val string = "hello"
    println(string.vowelCount())
}