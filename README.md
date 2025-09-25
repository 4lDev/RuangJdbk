# Ruangan (Kotlin)

---

## Nama Kelompok :
Albet Michael Kristian - 235314177

Yosafat Mauli Manurung - 235314162

---

Sistem ini memodelkan **ruangan** beserta **meja** dan **kursi** menggunakan prinsip **Object-Oriented Programming (OOP)** di Kotlin. Project ini cocok untuk simulasi pengelolaan ruang belajar, kantor, auditorium, atau ruang pertemuan.  

---

## Fitur Utama
- Menambahkan **meja** ke dalam ruangan  
- Menambahkan **kursi** ke dalam ruangan  
- Menampilkan daftar **meja** yang tersedia  
- Menampilkan daftar **kursi** yang tersedia  
- Menyimpan atribut fisik ruangan seperti **panjang, lebar, tinggi**  
- Menyimpan jumlah **viewer (layar)** dan **AC** di ruangan  

---

## Struktur Kelas

| Kelas | Deskripsi |
|-------|-----------|
| `Meja` | Merepresentasikan meja dengan atribut: <br>- `panjang: Int` → panjang meja (cm) <br>- `lebar: Int` → lebar meja (cm) <br>- `tinggi: Int` → tinggi meja (cm) <br>- `kapasitas: Int` → jumlah orang yang dapat duduk di meja |
| `Kursi` | Merepresentasikan kursi dengan atribut: <br>- `panjang: Int` → panjang kursi (cm) <br>- `lebar: Int` → lebar kursi (cm) <br>- `tinggi: Int` → tinggi kursi (cm) <br>- `tipe: String` → jenis kursi (misal "Kayu", "Plastik", "Empuk") |
| `Ruang` | Merepresentasikan **ruangan fisik** yang dapat menampung **meja** dan **kursi**, dengan atribut: <br>- `panjang: Int` → panjang ruangan (cm) <br>- `lebar: Int` → lebar ruangan (cm) <br>- `tinggi: Int` → tinggi ruangan (cm) <br>- `viewer: Int` → jumlah layar/monitor dalam ruangan <br>- `ac: Int` → jumlah AC di ruangan <br><br>Kelas ini memiliki dua list internal: `listMeja` dan `listKursi` untuk menyimpan objek `Meja` dan `Kursi`. <br>Fungsi utama: <br>- `tambahMeja(meja: Meja)` → menambahkan meja ke ruangan <br>- `tambahKursi(kursi: Kursi)` → menambahkan kursi ke ruangan <br>- `tampilMeja()` → menampilkan semua meja dalam ruangan <br>- `tampilKursi()` → menampilkan semua kursi dalam ruangan |

---

## 📝 UML Diagram

Berikut diagram UML dari project:

![UML Diagram](diagram-uml.png)

---

## Cara Menjalankan

1. **Clone repository**  
   ```bash
   git clone https://github.com/username/oop-ruangan.git
   cd oop-ruangan
   ```
   
2. **Buka project di IDE Kotlin (disarankan IntelliJ IDEA)**

3. **Jalankan fungsi main() untuk melihat contoh penggunaan kelas Ruang, Meja, dan Kursi**

---

### Contoh Penggunaan

```kotlin
fun main() {
    // Membuat objek Ruang dengan ukuran fisik dan fasilitas
    val ruang = Ruang(panjang = 500, lebar = 400, tinggi = 300, viewer = 2, ac = 1)

    // Menambahkan meja
    ruang.tambahMeja(Meja(1, panjang = 120, lebar = 60, tinggi = 75, kapasitas = 4))
    ruang.tambahMeja(Meja(2, panjang = 150, lebar = 70, tinggi = 75, kapasitas = 6))

    // Menambahkan kursi
    ruang.tambahKursi(Kursi(1, panjang = 40, lebar = 40, tinggi = 90, tipe = "Kayu"))
    ruang.tambahKursi(Kursi(2, panjang = 45, lebar = 45, tinggi = 95, tipe = "Plastik"))

    // Menampilkan daftar meja dan kursi
    ruang.tampilMeja()
    ruang.tampilKursi()
}
```

### Catatan
- Menggunakan MutableList untuk menyimpan objek Meja dan Kursi.
