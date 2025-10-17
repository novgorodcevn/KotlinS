class Guide3(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun getContact() {
        println("Имя:$name\nНомер:$phoneNumber\nКомпания:$company")
    }
}

fun main() {
    val contacts = mutableListOf<Guide3>()

    do {
        println("Введите имя")
        val userName = readln()
        println("Введите номер телефона")
        val userNumber = readln().toLongOrNull()
        println("ВВедите компанию")
        val userCompany = readln()
        if (userNumber == null) {
            println("Вы не ввели номер телефона")
        } else {
            val contact = Guide3(
                name = userName,
                phoneNumber = userNumber,
                company = userCompany
            )
            contacts.add(contact)
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