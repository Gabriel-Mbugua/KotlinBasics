package com.car.maintain

interface CreditCard{
    val cardNumber:String

    fun  score(age:Int)

}

class MasterCard(override val cardNumber: String) :CreditCard{
    override fun score(age: Int) {
        if(age > 50){
            println("Negative")
        }else{
            println("Positive")
        }
    }

}

class VisaCard(override val cardNumber: String) :CreditCard{
    override fun score(age: Int) {
        if(age > 60){
            println("Negative")
        }else{
            println("Positive")
        }
    }

}

class PayPal(val client:CreditCard): CreditCard by client{
    fun print(){
        println(this.cardNumber)
    }
}

fun main(){
    val visa = VisaCard("123456")
    visa.score(51)

    val payPal1 = PayPal(visa)
    payPal1.print()

    val master = MasterCard("987654")
    master.score(60)

    val payPal2 = PayPal(master)
    payPal2.print()
}