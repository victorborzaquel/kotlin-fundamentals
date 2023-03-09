package examples.basics

fun main() {

    println("examples.basics.math = ${math(10, 20)}")

    fun mathInner(x: Int, y: Int) = x + y

    println("maths = ${mathInner(10, 20)}")

    mathDefault(y = 30)
}

fun math(x: Int, y: Int): Int {
    return x + y
}

fun mathBody(x: Int, y: Int): Int = x + y

fun mathBodyInference(x: Int, y: Int) = x + y

fun mathDefault(x: Int = 10, y: Int = 20, message: String = "Hello") {
    println("$message $x $y")
}