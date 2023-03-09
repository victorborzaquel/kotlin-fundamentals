package examples.java

import com.victor.Animal

fun main() {
    val cat = Animal("Luna", "cat", 4.0)

    println(cat)

    cat.weight = 5.0

    println(cat)
}