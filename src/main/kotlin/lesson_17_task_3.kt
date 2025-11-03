class Folder(
    name: String,
    numberFiles: Int,
    private val secrecy: Boolean,
) {

    private var numberFiles: Int = numberFiles
        get() = if (secrecy == true) {
            0
        } else field

    val name
        get() = if (secrecy == true) {
            println("Скрытая папка")
            numberFiles = 0
            println("Количество фалов:$numberFiles")
        } else {
            println("Количество фалов:$numberFiles")
        }.toString()
}

fun main() {
    val folder = Folder(
        name = "Отчетность",
        numberFiles = 11,
        secrecy = false
    )
    folder.name
}