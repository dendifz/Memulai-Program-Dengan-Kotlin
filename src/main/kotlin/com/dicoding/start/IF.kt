package com.dicoding.start

fun main(){
    val openHours = 7
    val now = 7
    val office: String
    office = if (now > 7) {
        "Office already open"
    } else if (now == openHours){
        "Wait a minute, office will be open"
    } else {
        "Office is closed"
    }

    /* When Statement
    val office: String = when {
        now > 7 -> {
            "Office already open"
        }
        now == openHours -> {
            "Wait a minute, office will be open"
        }
        else -> {
            "Office is closed"
        }
    }*/

    print(office)
}