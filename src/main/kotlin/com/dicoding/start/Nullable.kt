package com.dicoding.start

val text: String? = null

fun main(){
    // val textLength = text.length Error
    if (text != null){
        val textLength = text.length // ready to go
    }

    text?.length
}
