package com.example.myapplication

fun withoutParameter(){
    println("== withoutParameter ==")
    println("Hello,World!")
}

fun withParameter(name: String){
    println()
    println("== withParameter ==")
    println("Hello,World!")
}

// named argument --> cara untuk memanggil fungsi denga menyebutkan nama parameter
fun withNamedArgument(name: String, age: Int){
    println()
    println("== withNamedArgument ==")
    println("Hello, $name! You are $age years old.")
}

// default parameter value --> cara untuk memberikan  niali default pada parameter fungsi
fun withDefaultParameter(name: String = "Indra", age: Int){
    println()
    println("== withDefaultArgument ==")
    println("Hello, $name! You are $age years old.")
}

fun withReturn(panjang: Int, lebar: Int) {
    return println( panjang * lebar)
}

fun main(){
    withoutParameter()
    withParameter("John")
    withNamedArgument(name = "John", age = 30)
    withDefaultParameter(age = 25)
}