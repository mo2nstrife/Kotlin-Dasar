fun main() {

    val names: Array<String> = arrayOf("Mo2n", "Budi", "Eko")

    // names.set(0, "momon")
    names[0] = "momon"
    println(names[0])

    val nilai: Array<Int> = arrayOf(10,9,8)

    println(nilai[0])
    println(nilai[1])
    println(nilai[2])

    val members: Array<String?> = arrayOfNulls(3)
    members[0] = "mo2n"
    members[0] = "mo2n"
    members[0] = "mo2n"

    println(members[0])
    println(members.size)
}