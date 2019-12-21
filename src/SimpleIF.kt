fun main(){

    print("Enter your grade: ")
    val grade = readLine()!!.toInt()

    if (grade >= 90){
        println("A")
    }
    if(grade in 80..90){
        println("B")
    }
    if (grade in 60..79){
        println("C")
    }
    if(grade < 50){
        println("Fail")
    }

}