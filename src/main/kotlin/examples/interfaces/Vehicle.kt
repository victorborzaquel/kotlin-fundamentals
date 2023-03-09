package examples.interfaces

interface Vehicle {
    val automakerName: String

    fun start() = println("Vroom vroom")

    fun stop() = println("Screech")

    fun getKmPerLiter() = 17

    fun getDoors(): Int
}