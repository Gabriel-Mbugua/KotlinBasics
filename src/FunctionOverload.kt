

fun add(x:Int, y:Int):Int {
    return x + y
}

fun add(x:Int, y:Int, z:Int):Int {
    return x + y + z
}

fun add(x:Int, y:Int, z: Int, a:Int):Int {
    return x + y + z + a
}

fun main(){
    println(add(1,1))
    println(add(1,1,1))
    println(add(1,1, 1,1))
}