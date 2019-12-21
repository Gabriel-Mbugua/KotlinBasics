package com.car.maintain

open class CarOptions() {
    var type:String?= null
    var model:Int?= null
    private var price:Double?=null
    var miles:Int?=0
    var owner:String?=null

    constructor(type:String, model:Int, price:Double, miles:Int, owner:String):this(){
        this.type = type
        this.model = model
        this.price = price
        this.miles = miles
        this.owner = owner
    }
    constructor(type:String, model:Int, price:Double, miles:Int):this(){
        this.type = type
        this.model = model
        this.price = price
        this.miles = miles
    }

    open fun getCarPrice(): Double {
        return this.price!! - (this.miles!!.toDouble() * 10)
    }

    fun getPrice():Double{
        return this.price!!
    }
}

fun main() {

    val car1 = CarOptions("Renault", 2013, 7000.0, 105, "Gabriel")
    car1.type = "Kwid"
    println(car1.type)
    println(car1.owner)
    println(car1.getCarPrice())

    val car2 = CarOptions("Toyota", 2017, 50000.0, 105)
    println(car2.type)
    println(car2.owner)
    println(car2.getCarPrice())

}