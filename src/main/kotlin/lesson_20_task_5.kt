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
    private var stringModifier: ((String) -> String)? = null

    fun say() {
        val phraseToProcess = listPhrases.random()
        val finalPhrase = stringModifier?.invoke(phraseToProcess) ?: phraseToProcess
        println(finalPhrase)
    }

    fun setModifier(modifier: (String) -> String) {
        this.stringModifier = modifier
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