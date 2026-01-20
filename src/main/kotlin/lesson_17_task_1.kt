class Quiz(
    question: String,
    answer: String
) {
    var question: String = question
        get() = field

    var answer: String = answer
        get() = field
        set(value) {
            field = value
        }
}