package com.dicoding.dataclass

val list = (1..1000000).toList()
val sequenceNumber = generateSequence(1) { it + 1 }

fun main(){
    list.filter { it % 5 == 0 }.map { it * 2 }.forEach { println(it) }
    list.asSequence().filter { it % 5 == 0 }.map { it * 2 }.forEach { println(it) }
    sequenceNumber.take(5).forEach { print("$it ") }
}