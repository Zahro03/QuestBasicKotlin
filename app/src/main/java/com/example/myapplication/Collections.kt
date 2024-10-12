package com.example.myapplication

// List adalah kumpulan data yang disusun secara berurutan
// List  bersifat ordered, artinya data yang dimasukkan akan memiliki posisi sesuai urutan
// List bersifat mutable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
// List Read-Only menggunakan ListOf
// List  mutable menggunakan mutableListOf


fun ContohList() {
    println("=== List ===")
    //List Read-Only
    val readOnlyAbjad = listOf("A","B", "C")
    println(readOnlyAbjad)

    // LIst Mutable
    val shape: MutableList<String> = mutableListOf("Circle","Square","Triangle")
    println(shape)

    //Menambahkan data ke dalam List Mutable
    shape.add("Circle")
    println(shape)

    //Menghapus data dari List Mutable
    shape.remove("Triangle)")
    println(shape)

    println(shape.first())
    println(shape.last())
    println(shape.count())

    shape.removeAt(1)
    println(shape)

    // Mengubah data didalam list mutable
    shape[0] = "Oval"
    println(shape)

    // List Read-Only
    val shapesLocked: List<String> = shape
    println(shapesLocked)
}

// Set adalah kumpulan data yang tidak memiliki posisi atau urutan dan hanya menyimpan data unik(tidak ada duplikasi)
// Set bersifat unodered, artinya data yang dimassukkan tidak memiliki posisi tertentu
// Set bersifat mutable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
// Set Read-Only menggunakan setOf
// Set mutable menggunakan mutableSetOf


fun ContohSet() {
    println()
    println("=== Set ===")

    // Set Read-Only
    val readOnlyAbjad = setOf("A", "B", "C")
    println(readOnlyAbjad)

    // Set Mutable
    val shape: MutableSet<String> = mutableSetOf("Circle", "Square", "Triangle")
    println(shape)

    //Menambahkan data ke dalam set mutable
    shape.add("Rectangle")
    println(shape)

    //Menghapus data dari set mutable
    shape.remove("Circle")
    println(shape)

    // Set Read-Only
    val shapesLocked: Set<String> = shape
    println(shapesLocked)
}

// Map adalah Kumpulan data yang disusun dalam pasangan key-value
// Map bersifat unordered,artinya data yang dimasukkan tidak memiliki posisi tertentu
// Map bersifat mutable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
// Map Read-Only menggunakan mapOf
// Map Mutable menggunakan mutableMapOf

fun ContohMap() {

    println()
    println("=== Map ===")
    // Map Read-Only
    val readOnlyShape: Map<String, Int> = mapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(readOnlyShape)

    // Map Mutable
    val shape: MutableMap<String, Int> = mutableMapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(shape)

    // Menambahkan data ke dalam map mutable
    shape["Rectangle"] = 4
    println(shape)

    // Menghapus data dari map mutable
    shape.remove("Circle")
    println(shape)

    // Mengubah data di dalam map mutable
    shape["Square"] = 5
    println(shape)

    // Map Read-Only
    val shapesLocked: Map<String, Int> = shape
    println(readOnlyShape)
}

fun main() {
    ContohList()
    ContohSet()
    ContohMap()
}
