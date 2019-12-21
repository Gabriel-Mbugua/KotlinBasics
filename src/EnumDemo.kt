enum class Direction {
    NORTH, SOUTH, EAST, WEST
}

fun main(args: Array<String>) {
    var userDirection = Direction.SOUTH
    if(userDirection.equals(Direction.NORTH)){
        println("You went $userDirection")
    }
    else{
        println("Don't know where you went")
    }
}