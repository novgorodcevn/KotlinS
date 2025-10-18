class Guide2(
    val name: String,
    val phoneNumber: Long,
    var company: String? = null,
) {
    fun getContact() {
        println("Имя:$name\nНомер:$phoneNumber\nКомпания:$company")
    }
}

fun main() {
    val contact = Guide2(
        name = "Bob",
        phoneNumber = 8923464578,
        company = "ssa"
        )
    if (contact.company == null){
        contact.company ="<не указано>"
    }
    contact.getContact()
}