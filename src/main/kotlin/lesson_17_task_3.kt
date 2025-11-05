class Folder(
    name: String,
    numberFiles: Int,
    private val isSecret: Boolean,
) {
    val numberFiles: Int = numberFiles
        get() = if (isSecret) {
            0
        } else field

    val name: String = name
        get() = if (isSecret) {
            "Скрытая папка"
        } else field
}

fun main() {
    val secretFolder = Folder(
        name = "Отчетность",
        numberFiles = 11,
        isSecret = true
    )
    println(secretFolder.name)
    println(secretFolder.numberFiles)
}