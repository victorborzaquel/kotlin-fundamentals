package examples.objects

fun main() {
    val location = object {
        var x = 200
        var y = 400
    }

    println("location = ${location.x} ${location.y}")

    val location2 = object {
        var x = 500
        var y = 700
        fun print() {
            println("location = $x $y")
        }
    }

    location2.print()
    location2.x = 6000
    location2.print()

    val temperature = Singleton.getLastTemperature()

    println("temperature = $temperature")
}