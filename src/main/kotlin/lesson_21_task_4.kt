import java.io.File

fun File.prependWord(word: String) {
    createNewFile()
    val lowerWord = word.lowercase()
    val currentText = readText()
    writeText("$lowerWord $currentText")
}

fun main() {
    val file = File("words.txt")
    file.prependWord("Hello")
    file.prependWord("Word")
    println(file.readText())
}