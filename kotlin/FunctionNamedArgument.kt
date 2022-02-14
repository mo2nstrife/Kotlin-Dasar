fun fullName(
    firstName: String,
    midleName: String,
    lastName: String
) {
    println("Hello $firstName $midleName $lastName") }

fun main() {
    fullName("Mo2n", "Strife", "GGWP")
    fullName(
        lastName = "GGWP",
        firstName = "Mo2n",
        midleName = "Strife"
    )
}