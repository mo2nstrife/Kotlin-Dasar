fun String.hello(): String = "hello $this"
    // return "Hello $this"

fun String.printHello(): Unit = println("Halo $this")


fun main() {
    val name = "Mo2n"
    println(name.hello())

    name.printHello()

    "Jesica".printHello()
}