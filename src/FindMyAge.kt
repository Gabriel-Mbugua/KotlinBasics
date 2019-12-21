import java.util.*

fun main() {

    print("Enter Year of Birth: ")
    val yearOfBirth:Int = readLine()!!.toInt()

    //Gets the current year from the device
    val currentYear = Calendar.getInstance ().get(Calendar.YEAR)

    val age = currentYear - yearOfBirth
    println("You are $age years old")
}