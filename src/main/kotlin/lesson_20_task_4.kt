fun main() {
    val list = listOf<String>("один", "два", "три", "четыре", "пять", "шесть")

    val listLambda: (List<String>) -> Unit = { list: List<String> ->
        list.filterIndexed { index, element -> index % 2 == 0 }.map {
            println("Нажат элемент [$it]")
        }
    }
    listLambda(list)
}