class OnlineStoreOrder {
    val orderNumber = 1
    private var readyStatus: Boolean = false

    fun changOrderStatus(newStatus: Boolean) = newStatus.also { readyStatus = it }
}

fun main() {
    val onlineStoreOrder = OnlineStoreOrder()
    println(onlineStoreOrder.changOrderStatus(true))
}