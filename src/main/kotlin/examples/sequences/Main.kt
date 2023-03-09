package examples.sequences

fun main() {
    fun getNames() = listOf("João", "Maria", "José", "Pedro")

    println(getNames().drop(1).take(3))

    println(generateSequence(100) { it + 1 }.drop(5).take(20).toList())

    val squares = generateSequence(1) { it + 1 }.map { it * it }
    val evenSquares = squares.filter { it % 2 == 0 }

    println(evenSquares.take(10).toList())

    // Pair(0,1) == 0 to 1
    val fibonacci = generateSequence(Pair(0, 1)) { Pair(it.second, it.first + it.second) }.map { it.first }
    println(fibonacci.take(10).toList())
}