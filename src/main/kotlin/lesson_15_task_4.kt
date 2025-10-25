abstract class Product(
    val title: String,
    val quantity: Int,
)

interface SearchСomponents {

    fun startSearch() {
        println("Выполняется поиск")
    }
}

class Tool(
    title: String,
    quantity: Int
) : Product(title, quantity), SearchСomponents

class Accessories(
    title: String,
    quantity: Int
) : Product(title, quantity)
