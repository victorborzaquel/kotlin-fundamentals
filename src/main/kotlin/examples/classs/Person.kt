package examples.classs

class Person (
    val firstName: String,
    val lastName: String
){
    init {
        println("$firstName $lastName")
    }
}