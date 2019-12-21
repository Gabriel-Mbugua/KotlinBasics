/*
mutable: you can update or add more
immutable: you can't update or add more
 */


fun main(){
//Immutable List
    val immutablelist = listOf("Gabriel","Keanu")
    for (name in immutablelist){
        println(name)
    }

//Mutable List
    var mutableList = mutableListOf("Gabriel", "Jack")
    mutableList[0] = "Idris"
    for (name in mutableList){
        println(name)
    }

//Immutable HashMap
    val immutableListOfUsers = mapOf(1 to "Gabriel", 2 to "Kevin")
    for (key in immutableListOfUsers.keys){
        println(immutableListOfUsers[key])
    }

    var mutableListofUsers = mutableMapOf(1 to "Gabriel", 2 to "Conan")
    mutableListofUsers[1] = "Bill"
    for(key in mutableListofUsers.keys){
        println(mutableListofUsers[key])
    }

}