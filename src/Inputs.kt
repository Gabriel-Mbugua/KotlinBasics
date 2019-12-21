fun main() {

    //Ask for user name
    print("Enter name: ")
    //Read user input and store it in variable name
    val name: String = readLine()!!.toString()
    print("Enter age: ")
    val age: Int = readLine()!!.toInt()
    print("Enter GPA: ")
    val GPA: Double = readLine()!!.toDouble()

    println("==== User Info ====")
    println("Your name: $name")
    println("Your age: $age")
    println("Your GPA: $GPA")
}