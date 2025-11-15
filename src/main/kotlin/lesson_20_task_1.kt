fun main() {
    val printHappyNewYear: (String) -> String = { userName: String ->
        "С наступающим Новым Годом,$userName!"
    }
    println(printHappyNewYear("Никита"))
}