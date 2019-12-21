class Outer {
    private var name: String? = null

    inner class Nested{
        fun Show(){
            name = "Gabriel"
            println(name)
        }
    }
}

fun main(args:Array<String>){
    var outer = Outer()
    var nested = outer.Nested()
    println(nested.Show())

}