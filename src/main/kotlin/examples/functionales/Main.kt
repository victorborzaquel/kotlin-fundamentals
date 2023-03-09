package examples.functionales

import org.funktionale.collections.destructured
import org.funktionale.composition.compose

fun main() {
    val (head, tail) = listOf(1, 2, 3, 4, 5).destructured()
    println("head: $head | tail: $tail")

    val add5 = {i: Int -> i + 5}

    val multiplyBy2 = {i: Int -> i * 2}

    val multiplayBy2AndAdd5 = multiplyBy2 compose add5

    val composeResult = multiplayBy2AndAdd5(10)

    println("composeResult: $composeResult")
}