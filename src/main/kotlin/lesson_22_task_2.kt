class RegularBook(
    val title: String,
    val author: String,
) {
    override fun toString(): String {
        return "RegularBook(title='$title', author='$author')"
    }
}

data class DataBook(
    val title: String,
    val author: String,
)

fun main() {
    val regularBook = RegularBook(
        title = "Граф монте Кристо",
        author = "Дюма"
    )

    val dataBook = DataBook(
        title = "Словарь",
        author = "Иванов",
    )

    println(regularBook)
    println(dataBook)
    // в дада классе переоределять метод toString не обязательно
}