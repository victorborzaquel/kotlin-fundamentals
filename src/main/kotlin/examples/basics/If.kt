package examples.basics

fun main() {
    val int = 10

    val ternario = if (int == 10) "10" else "not 10"

    val ter = if (int == 10) {
        println("10")
        "10"
    } else {
        println("not 10")
        "not 10"
    }
}