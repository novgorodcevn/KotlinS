open class Message(
    val author: String,
    val text: String,
    val id: Int,
)

class ChildMessage(
    author: String,
    text: String,
    id: Int,
    val parentMessageId: Int,
) : Message(author, text, id)

class Chat(
    private val messages: MutableList<Message> = mutableListOf(),
    private var generationId: Int = 0,
) {
    fun addMessage(text: String, author: String) {
        generationId++
        val message = Message(
            text = text,
            author = author,
            id = generationId
        )
        messages.add(message)
    }

    fun addThreadMessage(text: String, author: String, parentMessageId: Int) {
        if (!messages.any { it.id == parentMessageId }) {
            println("Родительского сообщения нет с таким id:$parentMessageId")
            return
        }
        val childMessage = ChildMessage(
            text = text,
            author = author,
            id = parentMessageId,
            parentMessageId = parentMessageId,
        )
        messages.add(childMessage)
    }

    fun printChat() {

        val groupByMessage = messages.groupBy { message ->
            when (message) {
                is ChildMessage -> message.parentMessageId
                else -> message.id
            }

        }

        messages.filter { it !is ChildMessage }.forEach { message ->
            println("${message.author} ${message.text} ${message.id}")
            val threadMessage = groupByMessage[message.id]?.filter { it is ChildMessage }

            threadMessage?.forEach { message ->
                println("\t${message.author} ${message.text} ${message.id}")
            }
        }
    }
}

fun main() {
    val chat = Chat()

    chat.addMessage("всем привет", "иван")
    chat.addMessage("всем привет", "дима")
    chat.addMessage("всем привет", "вова")

    chat.addThreadMessage("и тебе привет,иван", "леха", 1)
    chat.addThreadMessage("и тебе привет,дима", "петя", 2)
    chat.addThreadMessage("и тебе привет,дима", "федор", 3)
    chat.addThreadMessage("и тебе привет,дима", "сема", 3)
    chat.addThreadMessage("и тебе привет,дима", "шома", 3)
    chat.printChat()

}






