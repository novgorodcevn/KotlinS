class Guide2(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun getContact() {
        val company = company ?: "<не указано>"
        println("Имя:$name\nНомер:$phoneNumber\nКомпания:$company")
    }
}

fun main() {
    val contact = Guide2(
        name = "Bob",
        phoneNumber = 8923464578,
        )
    contact.getContact()
}