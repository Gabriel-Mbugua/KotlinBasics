class UserAdmin<T> (credit:T) {
    init {
        println(credit)
    }
}

fun <T> display(process:T){
    println(process)
}

fun main(args:Array<String>){
    var userAdmin1 = UserAdmin<String>("Gabriel")
    var userAdmin2 = UserAdmin<Int>(123)
    var userAdmin3 = UserAdmin<Double>(2.0)

    display<Int>(33)
}