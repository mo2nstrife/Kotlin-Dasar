fun main() {
    fun hello(name: String, transformer: (String) -> String): String {
        val nameTransform = transformer(name)
        return "hello $nameTransform"
    }

    val upper = fun(value: String): String {
        if (value == "") {
            return "UPS"
        } else {
            return value.uppercase()
        }
    }

    println(hello("mo2n", upper))
    println(hello("", upper))

    println(hello("mo2n strife", fun(value: String): String{
        return value.lowercase()
    }))
}