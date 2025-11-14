enum class Category {
    CLOTHING,
    STATIONERY,
    MISCELLANEOUS;

    fun getCategoryName() = when (this) {
        CLOTHING -> "Одежда"
        STATIONERY -> "Концелярские товары"
        MISCELLANEOUS -> "Разное"
    }
}

class Product(
    val name: String,
    val id: Int,
    val category: Category,
) {
    fun printInInfoProduct() {
        println("Имя товара:$name\nНомер товара $id\nкатегория ${category.getCategoryName()}")
    }
}

fun main() {
    val product = Product(
        name = "футболка",
        id = 1,
        category = Category.CLOTHING
    )
    product.printInInfoProduct()
    println()
    val product2 = Product(
        name = "карандаши",
        id = 2,
        category = Category.STATIONERY
    )
    product2.printInInfoProduct()
    println()
    val product3 = Product(
        name = "гантели",
        id = 3,
        category = Category.MISCELLANEOUS
    )
    product3.printInInfoProduct()
}