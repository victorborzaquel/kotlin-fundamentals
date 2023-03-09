package exercices

fun main() {
    val list = (1..100).toList()

    val result = list.map { item ->
        when {
            item % 3 == 0 && item % 5 == 0 -> "FizzBuzz"
            item % 3 == 0 -> "Fizz"
            item % 5 == 0 -> "Buzz"
            else -> item.toString()
        }
    }

    println(result)
}