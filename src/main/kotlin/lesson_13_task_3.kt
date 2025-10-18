class Guide3(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
)

fun main() {
    val contacts = listOf(
        Guide3(
            name = "Bob",
            phoneNumber = 8923464578,
            company = "null"
        ),
        Guide3(
            name = "Nikita",
            phoneNumber = 8925374634,
        ),
        Guide3(
            name = "Ivan",
            phoneNumber = 8364362362,
        ),
        Guide3(
            name = "Dima",
            phoneNumber = 8320329093,
            company = "Tinkoff",
        ),
        Guide3(
            name = "Aleksey",
            phoneNumber = 8443242423,
            company = "MTS"
        ),
    )
   println(contacts.mapNotNull { it.company })
}