package com.dicoding.start

fun main() {
    dataString()
    charString()
    escapedString()
    rawString()
}

fun dataString(){
    val text  = "Kotlin"
    val firstChar = text[0]

    print("First character of $text is $firstChar\n")
}

fun charString(){
    val text1  = "Kotlin"
    for (char in text1){
        print("$char \n")
    }
}

fun escapedString() {
    val name = "Unicode test: \u00A9 \n"
    print(name)
}

fun rawString() {
    val line = """
        Line 1
        Line 2
        Line 3
        Line 4
    """.trimIndent()

    print(line)
}