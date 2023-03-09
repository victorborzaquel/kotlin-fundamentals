package examples.classs

class Person2 internal constructor(val firstName: String, val lastName: String) {

    init {
        println("$firstName $lastName")
    }

    constructor(firstName: String, lastName: String, age: Int) :
            this(firstName, lastName)

}