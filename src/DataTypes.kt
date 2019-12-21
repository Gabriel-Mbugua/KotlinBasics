fun main() {

    var str: String
    str = "Welcome to kotlin"
    val name = "Gabriel"
    val age = 20
    val GPA = 4.0

    println("====User Info====")
    println("Name: $name")
    println("Age: $age")
    println("GPA: $GPA")

    var count = 1
    println(count)
    count = 10
    println(count)

    var department: String?
    department = "Software Engineer"

    println("Department: ${department!!}")
}