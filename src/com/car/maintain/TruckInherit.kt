package com.car.maintain

class TruckInherit : CarOptions {
    var subType: String? = null

    constructor(type: String, model: Int, price: Double, miles: Int, owner: String, subType: String) : super(
        type,
        model,
        price,
        miles,
        owner
    ) {
        this.subType = subType
    }

    constructor(type: String, model: Int, price: Double, miles: Int, subType: String) : super(
        type,
        model,
        price,
        miles
    ) {
        this.subType = subType
    }

    override fun getCarPrice(): Double {
        return this.getPrice()!! - (this.miles!!.toDouble() * 20)
    }

}

fun TruckInherit.getCarPriceWrapper():Double{
    return this.getCarPrice()
}

fun main() {

    val truck1 = TruckInherit("Renault", 2013, 7000.0, 105, "Gabriel", "Dump")
    truck1.type = "Kwid"
    println(truck1.type)
    println(truck1.owner)
    println(truck1.getCarPrice())
    println(truck1.getCarPriceWrapper())

    val truck2 = TruckInherit("Toyota", 2017, 50000.0, 105, "Garbage")
    println(truck2.type)
    println(truck2.owner)
    println(truck2.getCarPrice())
}