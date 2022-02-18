package com.dicoding.dataclass

fun main(){
    list()
    set()
    mapOf()
    filter()
}

fun list(){
    val anyList = mutableListOf('a', "Kotlin", 3, true)
    anyList.add('d') // menambah item di akhir list
    anyList.add(1, "love") // menambah item pada indeks ke-1
    anyList[3] = false // mengubah nilai item pada indeks ke-3
    anyList.removeAt(1) // menghapus item User() berdasarkan index atau posisi nilai di dalam Array
    println(anyList[1])
}

fun set(){
    val integerSet = setOf(1, 2, 4, 2, 1, 5)
    println(integerSet)

    val setA = setOf(1, 2, 4, 2, 1, 5)
    val setB = setOf(1, 2, 4, 5)
    println(setA == setB)

    println(5 in setA)

    val setC = setOf(1, 5, 7)
    val union = setA.union(setC)
    val intersect = setA.intersect(setC)

    println(union)
    println(intersect)

    val mutableSet = mutableSetOf(1, 2, 4, 2, 1, 5)
    mutableSet.add(6) // menambah item di akhir set
    mutableSet.remove(1) //menghapus item yang memiliki nilai 1

    println(mutableSet)
}

fun mapOf(){
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )

    println(capital["Jakarta"])
    println(capital.getValue("Jakarta"))

    val mapKeys = capital.keys
    val mapValue = capital.values

    println(mapValue)
    println(mapKeys)

    val mutableCapital = capital.toMutableMap()
    mutableCapital.put("Amsterdam", "Netherlands")
    mutableCapital.put("Berlin", "Germany")

    println(mutableCapital)

    println(mutableCapital["Amsterdam"])
    println(mutableCapital.getValue("Berlin"))

}

fun filter(){
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')

    val evenList = numberList.filter { it % 2 == 0 }
    val notEvenList = numberList.filterNot { it % 2 == 0 }
    val multipliedBy5 = numberList.map { it * 5 }
    val firstOddNumber = numberList.find { it % 2 == 1 }
    val firstOrNullNumber = numberList.firstOrNull { it % 2 == 3 }
    val total = numberList.sum()
    val ascendingSort = kotlinChar.sorted()
    val descendingSort = kotlinChar.sortedDescending()

    println(numberList.count())
    println(numberList.count { it % 3 == 0 })
    println(evenList)
    println(multipliedBy5)
    println(firstOddNumber)
    println(notEvenList)
    println(firstOrNullNumber)
    println(total)
    println(ascendingSort)
    println(descendingSort)

}