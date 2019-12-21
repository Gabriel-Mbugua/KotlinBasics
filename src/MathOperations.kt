fun main() {

    print("Please enter a number: ")
    val number1 = readLine()!!.toDouble()
    print("Please enter another number: ")
    val number2 = readLine()!!.toDouble()

    val sum = number1 + number2
    val sub = number1 - number2
    val mul = number1 * number2
    val div = number1 / number2
    val mod = number1 % number2

    println("Sum: $sum")
    println("Subtraction: $sub")
    println("Multiplication: $mul")
    println("Division : $div")
    println("Modulus: $mod")
}