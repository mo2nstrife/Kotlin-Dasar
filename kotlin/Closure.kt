fun main() {

    var counter = 0

    val lambdaIncrement: () -> Unit = {
        println("lambda increment")
        counter++
    }

    val anonymousIncrement = fun() {
        println("anonymous function increment")
        counter++
    }

    fun functionIncrement() {
        println("function increment")
        counter++
    }

    lambdaIncrement()
    anonymousIncrement()
    functionIncrement()

    println(counter)

}