package com.dicoding.controlflow

var counter = 8

fun main(){
    whiile()
    whileDo()
}

fun whiile(){
    while (counter <= 7){
        println("Hello, World!")
        counter++
    }
}

fun whileDo(){
    do {
        println("Hello, World!")
        counter++
    } while (counter <= 7)
}
