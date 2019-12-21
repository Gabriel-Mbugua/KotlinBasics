fun addNumbers(x: Double = 0.0, y: Double = 0.0): Double {
    val sum = x + y
    return sum
}

fun displayInfo(vararg names:String){
    for(name in names){
        println("Name: $name")
    }
}

fun main() {
    println("Start Main Function")
    var returnedSum = addNumbers(3.0, 4.0)
    println("Sum: $returnedSum")

    returnedSum = addNumbers(x = 5.0, y = 12.0)
    println("Sum: $returnedSum")

    returnedSum = addNumbers(y = 10.0)
    println("Sum: $returnedSum")

    returnedSum = addNumbers(6.0)
    println("Sum: $returnedSum")

    displayInfo(names = *arrayOf("Conan", "Keanu", "Bill"))

    println("End Main Function")
}