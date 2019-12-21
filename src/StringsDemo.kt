
fun main(){

    val message = " Welcome to my space ship!"
    val name = "Gabriel"
    val finalMessage = "$name! $message"
    println(finalMessage[1])
    println(finalMessage.toLowerCase())
    println(finalMessage.toUpperCase())
    println(message.trim()) //removes any spaces at the beginning and end
    println(message)

    val listOfTokens = message.split(" ")
    for (token in listOfTokens){
        if(!token.contains("to") && !token.contains("is"))
        println("token: $token")
    }
}