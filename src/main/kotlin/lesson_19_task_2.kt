enum class Category {
    CLOTHING {
        override fun getCategoryName(): String {
            return "Одежда"
        }
    },
    STATIONERY {
        override fun getCategoryName(): String {
            return "Концелярские товары"
        }
    },
    MISCELLANEOUS {
        override fun getCategoryName(): String {
            return "Разное"
        }
    };
    abstract fun getCategoryName(): String
}

class Product(
    val name: String,
    val id: Int,
    val category: Category,
) {
    fun getInfoProduct() {
        println("Имя товара:$name\nНомер товара $id\nкатегория ${category.getCategoryName()}")
    }
}

fun main() {
    val product = Product(
        name = "футболка",
        id = 1,
        category = Category.CLOTHING
    )
    product.getInfoProduct()
    println()
    val product2 = Product(
        name = "карандаши",
        id = 2,
        category = Category.STATIONERY
    )
    product2.getInfoProduct()
    println()
    val product3 = Product(
        name = "гантели",
        id = 3,
        category = Category.MISCELLANEOUS
    )
    product3.getInfoProduct()
}