package com.dicoding.dataclass

class User(val name : String, val age : Int){

    override fun toString(): String {
        return "User(name=$name, age=$age)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as User

        if (name != other.name) return false
        if (age != other.age) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age
        return result
    }

    fun intro(){
        println("My name is $name, I am $age years old")
    }
}

data class DataUser(val name : String, val age : Int){
    fun intro(){
        println("My name is $name, I am $age years old")
    }
}


val dataUser = DataUser("nrohmen", 17)
val dataUser2 = DataUser("nrohmen", 17)
val dataUser3 = DataUser("dimas", 24)

val user = User("nrohmen", 17)
val user2 = User("nrohmen", 17)
val user3 = User("dimas", 24)

fun main(){
    user.intro()
    dataUser.intro()

    equalsClass()
    modifClass()
    destructDeclaration()
}

fun equalsClass(){

    println(dataUser.equals(dataUser2))
    println(dataUser.equals(dataUser3))

    println(user.equals(user2))
    println(user.equals(user3))
}

fun modifClass(){
    val dataUser4 = dataUser.copy(age = 18)
    println(dataUser4)
}

fun destructDeclaration(){
    val name = dataUser.component1()
    val age = dataUser.component2()

    println("My name is $name, I am $age years old")
}

fun declaration(){
    val (name, age) = dataUser

    println("My name is $name, I am $age years old")
}