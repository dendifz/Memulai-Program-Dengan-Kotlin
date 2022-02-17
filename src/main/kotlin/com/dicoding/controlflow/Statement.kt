package com.dicoding.controlflow

fun main() {
    statement()
    expression()
}

fun statement(){
    val value1 = 10
    val value2 = 10

    sum(value1, value2)
}

fun expression() {
    sum(1 , 1 * 4)
}

fun sum(value1: Int, value2: Int) = value1 + value2
