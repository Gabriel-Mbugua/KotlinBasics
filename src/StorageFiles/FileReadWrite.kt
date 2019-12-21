package StorageFiles

import java.io.FileReader
import java.io.FileWriter

fun main(args: Array<String>) {
    println("1 - Read \n 2 - Write")
    val op = readLine()!!.toInt()
    when (op) {
        1 -> {
            readFromFile()
        }
        2 -> {
            print("Enter a message: ")
            val str = readLine()!!.toString()
            writeToFile(str)
        }
    }

}

fun writeToFile(str: String) {
    try {
        val name = FileWriter("test.txt", true)
        name.write(str + "\n")
        name.close()
    } catch (ex: Exception) {
        println("Error: ${ex.message}")
    }

}

fun readFromFile() {
    try {
        val name = FileReader("test.txt")
        var x: Int? //helps read the characters from the file
        do {
            x = name.read() //reads as ASCII code
            print(x.toChar())
        } while (x != -1)

    } catch (ex: Exception) {
        println("Error: ${ex.message}")
    }
}