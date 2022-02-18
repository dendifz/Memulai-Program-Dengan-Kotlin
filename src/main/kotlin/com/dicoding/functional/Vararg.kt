package com.dicoding.functional

fun main() {
    val number = sumNumbers(10, 20, 30, 40)
    println(number)

    println(asList(10, 'k', "Dicoding"))
}

fun sumNumbers(vararg number: Int): Int {
    return number.sum()
}

fun <T> asList(vararg input: T): List<T> {
    val result = ArrayList<T>()
    for (item in input)
        result.add(item)
    return result
}
