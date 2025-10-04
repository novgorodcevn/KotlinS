package lesson_9

fun main() {
    val amletProducts = listOf("яиц", "молока", "сливочного масла")
    val quantityProducts = listOf(2, 50, 15)
    val sizeProducts = listOf("шт", "мл", "гр")
    val overallResultProducts = mutableListOf<String>()
    println("Сколько хотите порций?")
    val userPortions = readln().toInt()

    val updatedQuantityProducts = quantityProducts.map {
        it * userPortions
    }

    for (i in amletProducts.indices) {
        val name = amletProducts[i]
        val quantity = updatedQuantityProducts[i]
        val size = sizeProducts[i]
        val overallResult = "$name-$quantity$size"
        overallResultProducts.add(overallResult)
    }
   println("На $userPortions порций вам понадобиться:${overallResultProducts.joinToString (",")}")
}