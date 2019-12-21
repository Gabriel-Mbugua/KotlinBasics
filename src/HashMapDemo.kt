
fun main(){

    var listOfUsers = HashMap<Int, String>()
    listOfUsers[123] = "Gabriel"
    listOfUsers[554] = "Jack"
    listOfUsers[12] = "Black"

    listOfUsers[123] = "Keanu"

    for(key in listOfUsers.keys){
        println("$key: ${listOfUsers[key]}")
    }


}