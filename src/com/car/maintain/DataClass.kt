package com.car.maintain

data class Person(val name:String, val age:Int, val gender:String)

fun main(){

    val person = Person("Gabriel", 20, "Male")
    println("Your name: ${person.name}")
    println("Your name: ${person.age}")
    println("Your name: ${person.gender}")

}
