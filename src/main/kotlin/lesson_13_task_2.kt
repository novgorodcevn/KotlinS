class Guide2(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun getContact() {
        println("Имя:$name\nНомер:$phoneNumber\nКомпания:${company ?: "<не указано>"}")
    }
}

fun main() {
    val contact = Guide2(
        name = "Bob",
        phoneNumber = 8923464578,
        )
    contact.getContact()
}