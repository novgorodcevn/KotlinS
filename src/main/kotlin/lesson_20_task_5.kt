class Works {

    private val listPhrases = listOf(
        "Привет",
        "Хороший сегодня день",
        "Отличные выходные",
        "Хорошо выспаться",
        "Удачи на экзамене",
        "Продуктивной работы",
        "Хорошего настроения",
    )
    private var modifier: (String) -> String = { it }

    fun say() {
        val finalPhrase = modifier(listPhrases.random())
        println(finalPhrase)
    }

    fun setModifier(modifier: (String) -> String) {
        this.modifier = modifier
    }
}

val reverseWordsModifier: (String) -> String = { phrase ->
    phrase.split(" ").reversed().joinToString(" ")
}

fun main() {
    val works = Works()
    works.say()
    works.setModifier(reverseWordsModifier)
    works.say()
}