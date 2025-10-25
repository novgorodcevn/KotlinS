abstract class Product(
    val title: String,
    val quantity: Int,
)

interface SearchComponents {

    fun startSearch() {
        println("Выполняется поиск")
    }
}

class Tool(
    title: String,
    quantity: Int
) : Product(title, quantity), SearchComponents

class Accessories(
    title: String,
    quantity: Int
) : Product(title, quantity)
