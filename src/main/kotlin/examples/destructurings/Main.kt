package examples.destructurings

import examples.overloads.Coordinates

fun main() {
    val coordinates = Coordinates(20, 10)

    val (x, y) = coordinates

    println("X = $x, Y = $y")
    println("X = ${coordinates.component1()}, Y = ${coordinates.component2()}")
}