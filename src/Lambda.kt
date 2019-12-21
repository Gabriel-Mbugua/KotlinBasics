val sum = { x: Int, y: Int ->
    x + y
}

fun main() {
    val addNumbers = sum(3, 4)
    println("===== Add two numbers =====")
    println("Result: $addNumbers")

    val listOfNumbers = listOf(10, 15, 22, 34, 80)

    //normal for loop

//    for (num in listOfNumbers) {
//        println(num)
//    }
    println("===== List of numbers =====")
    listOfNumbers.forEach { number -> println(number) }
}