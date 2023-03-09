package examples.java

class PersonJava internal constructor(var firstName: String, var lastName: String) {

    init {
        println("PersonJava init")
    }

    constructor(firstName: String, lastName: String, age: Int) : this(firstName, lastName) {

    }
}