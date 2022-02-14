inline fun hello(
    firstName: () -> String,
    noinline lastName: () -> String
): String {
    return "Hello ${firstName()} ${lastName()}"
}

fun main() {
    for (i in 0..10) {
        println(hello({ "mo2n" }, { "strife" }))
    }
}
