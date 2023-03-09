package examples.overloads

fun main() {
    val coord1 = Coordinates(10, 10)
    val coord2 = Coordinates(20, 20)

    val coord3 = coord1 + coord2
    println(coord3)

}