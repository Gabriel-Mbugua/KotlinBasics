
var name:String?=null

fun showUserInfo(){
    name = "Freddy"
    println("Name: $name")
}

fun main(){
    name = "Gabriel"
    println(name)
    showUserInfo()
    println(name)
}