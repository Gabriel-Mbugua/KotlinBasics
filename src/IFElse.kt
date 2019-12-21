fun main() {

    print("Enter garde: ")
    val grade = readLine()!!.toInt()

    if(grade >= 90){
        println("A+")
    }
    else if(grade in 80..89){
        println("A")
    }
    else if(grade in 70..79){
        println("B")
    }
    else{
        println("Pass")
    }

}