package com.example.myapplication

// Lambda Functions --> fungsi yang tidak memiliki nama
// Lambda Functions biasanya digunakan untuk membuat fungsi yang sederhana
// Lambda Functions menggunakan tanda panah (->) untuk memisahkan parameter dan body

fun uppercaseString(string: String): String{
    return string.uppercase()
}

// Dapat ditulis dalam ekspresi lambda sbb
fun main(){
    uppercaseString("hello")
    println({ string: String -> string.uppercase()}("hello"))
    // HELLO
}