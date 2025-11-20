fun String.vowelCount() : Int {
    val vowels = "aeiouAEIOU"
    var count = 0

    for (char in this){
        if (char in vowels){
            count++
        }
    }
    return count
}

fun main() {
    val string = "hello"
    println(string.vowelCount())
}