package com.dicoding.start

const val intNumber = 100
const val longNumber: Long = 100
const val shortNumber: Short = 10
const val byteNumber = 0b11010010
const val doubleNumber: Double = 1.3
const val floatNumber: Float = 0.123456789f //yang terbaca hanya 0.1234567

fun main(){
    maxmin()
    overflow()
    aplus()
    adivide()
    amix()
    conversion()
    readeble()
}

fun maxmin(){
    val maxInt = Int.MAX_VALUE
    val minInt = Int.MIN_VALUE

    println(maxInt)
    println(minInt)
}

fun overflow(){
    val maxInt = Int.MAX_VALUE
    val overRangeInt = Int.MAX_VALUE + 1 // This operation has led to an overflow

    println("Max Int: $maxInt")
    println("Over range Int: $overRangeInt")
}

fun aplus(){
    val numberOne = 1
    val numberTwo = 2

    println(numberOne + numberTwo)
}

fun adivide(){
    val numberOne: Int = 20
    val numberTwo: Int = 10

    println(numberOne / numberTwo)
}

fun amix(){
    println(5 + 4 * 4)
    println((5 + 4) * 4)
}

fun conversion(){
    val byteNumber: Byte = 10
    val intNumber: Int = byteNumber.toInt()

    println(intNumber)

    println(intNumber + byteNumber.toInt())

/*  toByte(): Byte
    toShort(): Short
    toInt(): Int
    toLong(): Long
    toFloat(): Float
    toDouble(): Double
    toChar(): Char */
}

fun readeble(){
    val readableNumber = 1_000_000
    println(readableNumber)
}