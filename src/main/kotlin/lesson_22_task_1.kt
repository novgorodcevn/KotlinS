class RegularBook(
    val title: String,
    val author: String,
)

data class DataBook(
    val title: String,
    val author: String,
)

fun main() {
    val regularBook = RegularBook(
        title = "Граф монте Кристо",
        author = "Дюма"
    )
    val regularBook2 = RegularBook(
        title = "Граф монте Кристо",
        author = "Дюма"
    )
    val dataBook = DataBook(
        title = "Словарь",
        author = "Иванов",
    )
    val dataBook2 = DataBook(
        title = "Словарь",
        author = "Иванов",
    )

    println(regularBook == regularBook2)
    println(dataBook == dataBook2)
    // в обычных классах сравниваются ссылки на обьекты в памяти,а в датаклассах сравниваются проиницилизированные даннные
}