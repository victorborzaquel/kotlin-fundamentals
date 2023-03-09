package examples.clousures

fun main() {
    val x = closure("x")
    val y = closure("y")

    x()
    x()
    x()
    x()

    y()
    y()
    y()
}

fun closure(name: String): () -> Unit {
    var x = 0

    return {
        x++
        println("$name: $x")
    }
}