fun main() {

    print("Input age: ")
    val age= readLine()!!.toInt()

    println(age in 18..30) //If age in this range then true

}