fun main() {

    println("PETS APP")
    var listOfPets = ArrayList<String>()

    do {
        print("Enter pet name or type 'quit' to exit: ")
        val petName = readLine()!!.toString()
        if (petName != "quit") {
            listOfPets.add(petName)
        }
    } while (petName != "quit")

    println("Your pets using arrays index: ")
    for (i in 0 until listOfPets.size) {
        println("Pet $i: ${listOfPets[i]}")
    }

    println("Your pets using object")

    for (pet in listOfPets) {
        println("Pet : $pet")
    }

    if(listOfPets.contains("dog")){
        println("Your dog qualifies for our program")
    }
}