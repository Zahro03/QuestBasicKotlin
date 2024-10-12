package com.example.myapplication

// Mendefinisikan kelas kosong bernama Motor
class Motor()

// Mendeklarasikan kelas Contact yang memiliki 2 properti
// id -> sebuah nilai tetap (val) yang tidak dapat diubah setelah diinisialisasi bertipe (Int)
// email -> sebuah nilai yang bisa diubah (var) bertipe (String)
class Contact(val id: Int, var email: String)


// Mendefinisikan fungsi main yang merupakan titik masuk program ketika dieksekusi
fun main() {
    val contact = Contact(1, "mary@gmail.com")
    // Membuat sebuah objek contact dari kelas Contact dengan id bernilai 1 dan email bersisi "mary@gmail.com
    // val digunakan karena variabel contact itu sendiri tidak akan diganti meskipun properti dalam objeknya bisa berubah

    // Mencetak nilai properti email dari objek contact ke output dan nilai yang dicetak adalah "mary@gmail.com"
    println(contact.email)

    // Mengubah nilai properti email dari objek contact menajadi "jane@gmail.com"
    contact.email = "jane@gmail.com"

    // Mencetak kembali nilai properti email dari objek contact,setelah diubah nilai yang dicetak adalah "jane@gmail.com"
    println(contact.email)
}