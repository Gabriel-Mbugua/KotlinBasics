fun main() {

    print("Please input a number: ")
    var x:Int = readLine()!!.toInt()
    print("Please input another number: ")
    var y:Int = readLine()!!.toInt()


    println("First number: $x")
    println("Second number: $y")

    val temp:Int = x
    x = y
    y = temp

    println("____New numbers____")
    println("First Number: $x")
    println("Second Number: $y")
}