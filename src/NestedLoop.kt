fun main() {

    for(userID in 1..2 step 1){
        print("$userID - Enter your name: ")
        val name = readLine()!!.toString()
        print("Where you live: ")
        val home = readLine()!!.toString()
        var petName: String?=""
        print("How many pets do you have: ")
        val petCount = readLine()!!.toInt()

        for(petID in 1..petCount){
            print("Enter pet $petID: ")
            petName = petName + readLine()!!.toString() + ","
        }

        println("===== User info =====")
        println("Name: $name")
        println("Home: $home")
        println("Pet: $petName")

        if(petName!!.contains("cat")){
            println("We sell food for your cat!")
        }
    }

}