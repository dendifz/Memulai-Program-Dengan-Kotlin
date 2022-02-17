package com.dicoding.controlflow

val rangeInt = 1..10

fun main(){
    range()
    rangeExpression()
    rangeNegation()
    rangeStep()
    rangeStatement()
}

fun range() {
    val rangeInt = 1..10
    println(rangeInt.step)
}

fun rangeStep() {
    val rangeInt = 1..10 step 2
    rangeInt.forEach {
        print("$it ")
    }
    println(rangeInt.step)
}

fun rangeExpression() {
    val tenToOne = 10.downTo(1)
    if (7 in tenToOne) {
        println("Value 7 available")
    }
}

fun rangeStatement() {
    if (1 <= 7 && 7 <= 10){
        println("Value 7 available")
    }
}

fun rangeNegation() {
    val tenToOne = 10.downTo(1)
    if (11 !in tenToOne) {
        println("No value 11 in Range ")
    }
}