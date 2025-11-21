class OnlineStoreOrder {
    val orderNumber = 1
    private var readyStatus: Boolean = false

    private fun changOrderStatus(newStatus: Boolean) = newStatus.also { readyStatus = it }

    fun sendManager(changStatus: Boolean): Boolean {
        return changOrderStatus(changStatus)
    }
}

fun main() {
    val onlineStoreOrder = OnlineStoreOrder()
    println(onlineStoreOrder.sendManager(true))
}