package examples.lambdas

fun main() {
    val students = getStudents()

    val combos = students.map {  "${it.name} : ${it.age}" }

    println(combos)
    println("Oldest: ${students.maxByOrNull { it.age }}")
    println("Age: ${students.filter { it.age > 18 }.first()}")
}