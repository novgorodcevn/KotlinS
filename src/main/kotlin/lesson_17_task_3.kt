class Folder(
    name: String,
    numberFiles: Int,
    private val isSecret: Boolean,
) {
    var numberFiles: Int = numberFiles
        get() = if (isSecret) {
            0
        } else field

    var name: String = name
        get() = if (isSecret) {
            "Скрытая папка"
        } else field
}

fun main() {
    val folder = Folder(
        name = "Отчетность",
        numberFiles = 11,
        isSecret = false
    )
    folder.name
}