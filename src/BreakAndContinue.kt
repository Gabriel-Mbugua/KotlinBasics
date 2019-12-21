fun main() {

    println("==== Continue Example ====")
    for (number in 1..10) {
        if (number == 5) {
            continue
        }
        println("Number: $number")
    }

    println("==== Break Example ====")
    for (number in 1..10) {
        if (number == 6) {
            break
        }
        println("Number: $number")
    }

    println("==== Break Inner Example ====")
    for (number in 1..10) {
        println("Number: $number")
        for (innerLoop in 1..7) {
            println("Inner Loop: $innerLoop")
            if (innerLoop == 6) {
                break
            }
        }
    }

    println("==== Break Outer Example ====")
    loop@ for (number in 1..10) {
        println("Number: $number")
        for (innerLoop in 1..7) {
            println("Inner Loop: $innerLoop")
            if (innerLoop == 6) {
                break@loop
            }
        }
    }
    println("END OF PROGRAM")

}