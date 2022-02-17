package com.dicoding.start

const val officeOpen = 7
const val officeClosed = 16
const val now = 20

fun main(){
    conjuctionBoolean()
    disconjuctionBoolean()
    negationBoolean()
}

fun conjuctionBoolean(){

    val isOpen = now >= officeOpen && now <= officeClosed
//        now in officeOpen..officeClosed  --- Range Check

    println("Office is open : $isOpen")
}

fun disconjuctionBoolean(){

    val isClose = now < officeOpen || now > officeClosed

    println("Office is closed : $isClose")
}

fun negationBoolean() {
    val isOpen = now > officeOpen

    if (!isOpen) {
        println("Office is closed")
    } else {
        println("Office is open")
    }

}