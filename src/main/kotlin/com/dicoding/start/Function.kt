package com.dicoding.start

fun main() {
    val user = setUser("Dendi", 21)
    println(user)

    printUser("Dendi")
}

fun setUser(name: String, age: Int) = "Your name is $name, and you $age years old"

fun printUser(name: String) {
    println("Your name is $name")
}