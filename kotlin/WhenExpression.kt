fun main() {
    val nilai = 'F'

    when (nilai) {
        'A' -> {
            println("Amazing")
        }
        'B' -> {
            println("Good")
        }
        'C' -> {
            println("Not Bad")
        }
        'D' -> {
            println("Bad")
        }
        else -> {
            println("Try Again Next Year")
        }
    }

    when (nilai){
        'A', 'B', 'C' -> {
            println("Selamat Anda Lulus")
        } else -> {
            println("Maaf, Anda Tidak Lulus!!!")
        }
    }


    val nilaiLulus : Array<Char> = arrayOf('A', 'B', 'C')
    when (nilai) {
        in nilaiLulus -> println("SELAMAT ANDA LULUS")
        !in nilaiLulus -> println("TIDAK LULUS")
    }

    val name = "mo2n"
    when (name) {
        is String -> println("Name is String")
        !is String -> println("Name is Not String")
    }

    val nilaiUjian = 91
    when {
        nilaiUjian > 90 -> println("Amazing")
        nilaiUjian > 80 -> println("Good Joob")
        nilaiUjian > 60 -> println("Not Bad")
        else -> println("Ngulang Tahun Depan")
    }
}