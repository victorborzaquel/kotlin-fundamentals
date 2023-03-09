package examples.generics

fun main() {
    val maxLong = max(42L, 99L)
    val maxInt = max(42, 99)
    val maxString = max("42", "99")

    println("maxLong = $maxLong")
    println("maxInt = $maxInt")
    println("maxString = $maxString")
}