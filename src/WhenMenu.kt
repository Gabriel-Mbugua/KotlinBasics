fun main(){

    print("E food: ")
    val foodID = readLine()!!.toInt()

    when(foodID){
        1 -> {
            println("Sandwich")
        }
        2 -> {
            println("Burger")
        }
        3 -> {
            println("Pizza")
        }
        else -> {
            println("No option selected")
        }
    }


}