package oop.ruangan

class Ruang(
    private val panjang: Int,
    private val lebar: Int,
    private val tinggi: Int,
    private val viewer: Int,
    private val ac: Int
) {
    private val listMeja = mutableListOf<Meja>()
    private val listKursi = mutableListOf<Kursi>()

    fun tambahMeja(meja: Meja) {
        listMeja.add(meja)
    }

    fun tambahKursi(kursi: Kursi) {
        listKursi.add(kursi)
    }

    fun tampilMeja() {
        println("Daftar meja dalam ruangan:")
        listMeja.forEach { println(it) }
    }

    fun tampilKursi() {
        println("Daftar kursi dalam Ruang:")
        listKursi.forEach { println(it) }
    }

}

fun main() {
    val ruang = Ruang(500, 400, 300, 2, 1)

    // tambah meja
    ruang.tambahMeja(Meja(120, 60, 75, 20))

    // tambah kursi
    ruang.tambahKursi(Kursi(40, 40, 90, "Kayu"))

    // Tampilkan Hasil
    ruang.tampilMeja()
    ruang.tampilKursi()
}