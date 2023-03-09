package examples.basics

fun main() {
    val x = 10

    when (x) {
        0,10 -> println("x is 1")
        20 -> println("x is 2")
        else -> println("x is not 1 or 2")
    }

    when (x) {
        in 1..10 -> println("x is between 1 and 10")
        !in 10..20 -> println("x is not between 10 and 20")
        else -> println("none of the above")
    }

    val y = 10
    when {
        y % 2 == 0 -> println("y is even")
        y % 2 == 1 -> println("y is odd")
        else -> println("y is funny")
    }

    when {
        x <= 0 -> println("x is negative or zero")
        x % 2 == 0 -> println("x is even")
        else -> println("x is odd")
    }
}