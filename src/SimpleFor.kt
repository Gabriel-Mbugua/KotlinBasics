fun main(){

//step is used to increment/decrement i
    println("________Increment________")
    for (i in 0..10 step 2){
        println("Number is $i!")
    }
    println("________Decrement________")
    for(i in 10 downTo 0 step 2){
        println("Numero: $i")
    }

}