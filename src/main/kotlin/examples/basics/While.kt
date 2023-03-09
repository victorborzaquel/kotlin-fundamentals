package examples.basics

fun main() {
    var x = 0
    while (x < 10) {
        println("x = $x")
        x++
    }

    var y = 0
    do {
        println("y = $y")
        y++
    } while (y < 10)
}