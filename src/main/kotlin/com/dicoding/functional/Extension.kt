package com.dicoding.functional

fun main() {
    println(10.plusThree())
    println(10.slice)
}

fun Int.plusThree(): Int {
    return this + 3
}

val Int.slice: Int
    get() = this / 2
