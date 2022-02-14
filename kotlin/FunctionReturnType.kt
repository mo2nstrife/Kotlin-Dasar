fun jumlahkan(a:Int, b:Int): Int{
    val total = a + b
    return total
}

fun main() {
    println(jumlahkan(10,10))
    println(jumlahkan(100,100))

    val result =  jumlahkan(200, 200)
    println(result)
}