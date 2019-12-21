package com.car.maintain

class Car(
    var type: String, val model: Int, val price: Double,
    val miles: Int, val owner: String
) {

    init {
        println("Object class is created")
    }

    fun getCarPrice():Double{
        return this.price - (this.miles.toDouble() * 10)
    }
}

fun main() {

    val car1 = Car("Renault", 2013, 7000.0, 105, "Gabriel")
    car1.type = "Kwid"
    println(car1.type)
    println(car1.owner)
    println(car1.getCarPrice())

    val car2 = Car("Toyota", 2017, 50000.0, 105, "Dominic")
    println(car2.type)
    println(car2.owner)
    println(car2.getCarPrice())

    var listOfCars = arrayListOf<Car>()
    listOfCars.add(car1)
    listOfCars.add(car2)
    
    for(car in listOfCars){
        println("___________")
        println(car.owner)
        println(car.getCarPrice())
    }

}