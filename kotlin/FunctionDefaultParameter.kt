fun hello(firstName: String, lastName: String? = null) {
    if (lastName == null) {
        println("Hello $firstName")
    }else{
        println("Hello $firstName $lastName")
    }
}
fun main() {
    hello("Mo2n")
    hello("Mo2n", "Strife")
    hello("eko", "kurniawan")
}