package examples.reflections

import examples.classs.Person
import examples.classs.Person2

fun main() {
    val person = Person2("Victor", "Hugo")

    val clazz = person::class

    println(clazz.simpleName)
    println(person.firstName)

    println("----")

    for (fields in clazz.members) {
        println(fields.name)
    }

    println("----")

    for (fields in clazz.java.declaredFields) {
        println(fields.name)
    }

    println("----")

    for (constructors in clazz.constructors) {
        println(constructors.name)
        println(constructors.parameters)
        println(constructors.returnType)
    }
}