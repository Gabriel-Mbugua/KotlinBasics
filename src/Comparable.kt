import java.util.*

class Person(var name:String, var age:Int): Comparable<Person>{

    override fun compareTo(other: Person): Int {
        // 0 means both are equal, "-" means first value is less than second value and
        //"+" means that first value is greater than second value
        //return this.age - other.age "Ascending order"
        return other.age - this.age //Descending order
    }
}

fun main(args:Array<String>) {
    var listOfNames = arrayListOf<Person>()
    listOfNames.add(Person("Keanu", 50))
    listOfNames.add(Person("Bill", 40))
    listOfNames.add(Person("Conan", 56))

    println("===== BEFORE SORT =====")
    for (person in listOfNames){
        println("Name: ${person.name} Age: ${person.age}")
    }

    println("===== AFTER SORT =====")
    Collections.sort(listOfNames)
    for (person in listOfNames){
        println("Name: ${person.name} Age: ${person.age}")
    }
}