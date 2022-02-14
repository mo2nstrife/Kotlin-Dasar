fun sayHello(firstName: String, lastName: String?){
    if (lastName == null){
    println ("Hello $firstName ")
} else {
    println ("Hello $firstName $lastName")
    }
}

fun main() {
    sayHello("Mo2n", "Strife")
    sayHello("Budi", null)
    sayHello("Joko", null)
}