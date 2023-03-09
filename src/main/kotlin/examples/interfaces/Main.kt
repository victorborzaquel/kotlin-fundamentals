package examples.interfaces

fun main() {
    val car = Car()
    car.start()
    car.stop()
    println(car.getKmPerLiter())
    println(car.getDoors())
    println(car.automakerName)
}