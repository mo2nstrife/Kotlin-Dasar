fun toUpper(value: String): String = value.uppercase()

fun main() {
    val contohLambda: (String, String) -> String = { firstName: String, lastName: String ->
        val result = "$firstName $lastName"
        result
    }

    val result = contohLambda("Mo2n", "Strife")
    println(result)

    val sayHello: (String) -> String = {
        "Hello $it"
    }
    println(sayHello("mo2n"))

    val toUpperCase : (String) -> String = ::toUpper
    println(toUpperCase("mo2n strife"))
}