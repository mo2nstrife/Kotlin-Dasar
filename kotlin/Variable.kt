const val APPLICATION = "Belajar Kotlin"
const val VERSION = "0.0.1"

fun main() {

    val firstName = "Mo2n"
    val lastName = "Strife"
    val age = 30

    println(firstName)
    println(lastName)
    println(age)

    var name: String? = null
    name = "mo2n"
    println(name)
    println(name?.length)

    println("$APPLICATION : $VERSION")

}