abstract class CreditCard() {
    fun CreditID(): String {
        return "2345"
    }
    abstract fun newCredit()
}

class UserInfo(): CreditCard(){
    fun getInfo():String{
        return CreditID()
    }

    override fun newCredit() {
        println("New card created!")
    }
}

fun main(args: Array<String>){
    var user = UserInfo()
    println(user.newCredit())
6}