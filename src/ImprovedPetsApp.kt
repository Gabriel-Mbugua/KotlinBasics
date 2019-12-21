import java.util.*
import kotlin.collections.HashMap

fun main() {

    var listOfUsers = HashMap<String, LinkedList<String>>()

    loop@ while (true) {
        print("Enter your name or type 'quit' to exit: ")
        val name = readLine()!!.toString().toLowerCase()
        if(name == "quit"){
            break@loop
        }
        print("Where you live: ")
        val home = readLine()!!.toString()

        var listOfUserPets = LinkedList<String>()
        do {
            print("Enter pet name or type 'next' to go next: ")
            val petName = readLine()!!.toString().toLowerCase()
            if (petName != "next") {
                listOfUserPets.add(petName)
            }
        } while (petName != "next")

        listOfUsers["$name: $home"] = listOfUserPets
    }


    println("===== USER INFO =====")
    for (key in listOfUsers.keys) {
        println("Name and home: $key")
        var listOfPets = listOfUsers[key]!!
        for (petName in listOfPets) {
            println("PetName: $petName")
        }

        if (listOfPets.contains("dog")) {
            println("Your dog is legible for oue program")
        }
    }

    println("END OF APP")
}