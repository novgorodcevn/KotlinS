class Guide(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
)

fun main() {
    val contact = Guide(
        name = "Bob",
        phoneNumber = 8923464578,
    )
}