fun main() {

    fun hello(name: String, transformer: (String) -> String): String {
        val nameTransform = transformer(name)
        return "hello $nameTransform"
    }

    val lambdaUpper = { value: String -> value.uppercase() }
    println(hello("mo2n strife", lambdaUpper))

    println(hello("mo2n strife",{ value: String -> value.lowercase() } ))

    val result1 = hello("mo2n strife",{ value: String -> value.uppercase() })
    val result2 = hello("mo2n strife") { value: String -> value.uppercase() }
}