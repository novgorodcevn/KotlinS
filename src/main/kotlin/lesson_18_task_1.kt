class Order(
    numberOrder: Int,
    private var _printProduct: String? = null
) {
    fun numberProducts(
        product: String,
    ) {
        val printProduct = "Заказон товар:$product"
        _printProduct = printProduct
    }

    fun numberProducts(
        product: List<String>,
    ) {
        val printProduct = "Заказанны товары:$product"
        _printProduct = printProduct
    }

    fun printOrderInfo() {
        println(_printProduct)
    }
}

fun main() {
    val order1 = Order(numberOrder = 1)
    order1.numberProducts(product = "Телефон")
    order1.printOrderInfo()

    val order2 = Order(2)
    order1.numberProducts(product = listOf("Кросовки", "Книга"))
    order1.printOrderInfo()
}