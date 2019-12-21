package StorageFiles

fun main(args: Array<String>){

    print("Enter a number: ")
    try {
        var x:Int = readLine()!!.toInt()
        var div = 100/x
        println("Divison: $div")
    }catch (ex:Exception){
        println("Error: ${ex.message}")
    }
    print("END OF APP")
}