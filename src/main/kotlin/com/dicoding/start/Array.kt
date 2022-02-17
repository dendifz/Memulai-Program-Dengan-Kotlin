package com.dicoding.start

val array = arrayOf(1, 3, 5, 7)
val mixArray = arrayOf(1, 3, 5, 7 , "Dicoding" , true)
val intArray = Array(4, { i -> i * i }) // [0, 1, 4, 9]

/* intArrayOf() : IntArray
booleanArrayOf() : BooleanArray
charArrayOf() : CharArray
longArrayOf() : LongArray
shortArrayOf() : ShortArray
byteArrayOf() : ByteArray */

fun main(){
    array[2] = 11
    println(array[2])
}
