fun main() {

    print("Input a number: ")
    var x: Double = readLine()!!.toDouble()
    print("Input another number: ")
    var y: Double = readLine()!!.toDouble()

    println("____Pre-Swapped Values____")
    println("First number: $x")
    println("Second number: $y")

    x = x + y

    println("____Swapped Values____")

    y = x - y
    x -= y

    println("First Number: $x")
    println("Second Number: $y")
}