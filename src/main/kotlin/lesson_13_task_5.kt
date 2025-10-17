import java.lang.NumberFormatException

class Guide5(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun getContact() {
        println("Имя:$name\nНомер:$phoneNumber\nКомпания:$company")
    }
}

fun main() {
    val contacts = mutableListOf<Guide5>()

    do {
        println("Введите имя")
        val userName = readln()
        println("Введите номер телефона")
        val userNumber = readln()

        try {
            val userNumberLong = userNumber.toLong()
            println("ВВедите компанию")
            val userCompany = readln()
            val contact = Guide5(
                name = userName,
                phoneNumber = userNumberLong,
                company = userCompany
            )
            contacts.add(contact)
        } catch (e: NumberFormatException) {
            println("Произошла ошибка${e.javaClass.simpleName}")
        }
        println("Хотите ввести еще контакт?")
        val userAnswer = readln()
        val nextContact = userAnswer.equals(POSITIVE_RESPONSE, true)

    } while (nextContact == true)

    contacts.forEach { contact ->
        contact.getContact()
    }
}

const val POSITIVE_RESPONSE = "да"