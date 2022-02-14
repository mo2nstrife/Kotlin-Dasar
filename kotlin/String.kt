fun main() {
    var firstname: String = "Mo2n"
    var lastname: String = "Strife"

    var address: String = """
        >Jalan Belum Jadi
        >Kabupaten Sukoharjo
        >Jawa Tengah
    """.trimMargin(">")

    println(firstname)
    println(lastname)
    println(address)

    var fullname: String = "$firstname $lastname"
    println(fullname)

    var desc: String = "$fullname length = ${fullname.length}"
    println(desc)
}