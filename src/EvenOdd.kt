fun main(){

    print("Enter a number: ")
    val number1 = readLine()!!.toInt()
    print("Enter another number: ")
    val number2 = readLine()!!.toInt()

    val mod1 = number1%2

    when(mod1){
        0 -> {
            println("$number1 is even")
        }
        else -> {
            println("$number1 is odd")
        }
    }

    val mod2 = number2%2

    when(mod2){
        0 -> {
            println("$number2 is even")
        }
        else -> {
            println("$number2 is odd")
        }
    }
}