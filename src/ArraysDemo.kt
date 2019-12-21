
fun main() {

    println("PETS APP")
    print("Enter number of pets: ")
    val maxSize = readLine()!!.toInt()
    var listOfPets:Array<String> = Array(maxSize){""}

    for (i in 0 until maxSize){
        println("Enter pet $i: ")
        listOfPets[i] = readLine()!!.toString()
    }
    println("Your pets using arrays: ")

    for (i in 0 until maxSize) {
        println("Pet $i: ${listOfPets[i]}")
    }

}