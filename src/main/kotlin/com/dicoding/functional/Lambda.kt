package com.dicoding.functional

fun main() {
    val length = messageLength("Hello From lambda")
    printMessage("Hello From Lambda")
    message()
    println("Message length $length")

    printResult(10) { value ->
        value + value
    }

    dsl()
}

val message = { println("Hello From Lambda") }
val printMessage = { message: String -> println(message) }
val messageLength = { message: String -> message.length }

fun printResult(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}

fun dsl() {
    val message = buildString {
        append("Hello ")
        append("from ")
        append("lambda ")
    }

    println(message)
}

fun buildString(action: StringBuilder.() -> Unit): String {
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return stringBuilder.toString()
}