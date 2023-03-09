package examples.objects

object Singleton {
    private val temperatures = listOf(10, 20, 30, 40, 50)
    fun getLastTemperature() = temperatures.last()
}