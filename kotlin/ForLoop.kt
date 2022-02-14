fun main() {
    val array = arrayOf("Mo2n", "Ganteng", "Banget")
    var total = 0
    for (name in array) {
        println(name)
        total++
    }
    println("Total pengulangan = $total")

    val ukuranArray = array.size - 1
    for (i in 0..ukuranArray) {
        println("index $i = ${array.get(i)}")
    }
}