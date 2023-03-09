package examples.basics

fun main() {
    for (item in 1..10) {
        println("item = $item")
    }

    for (item in "Victor") {
        println("item = $item")
    }

    for (item in 1..10 step 2) {
        println("item = $item")
    }

    for (item in 10 downTo 1) {
        println("item = $item")
    }
    for ((index, item) in 10.rangeTo(20).step(2).withIndex()) {
        println("index = $index, item = $item")
    }

    val list = listOf("Victor", "Lima", "Silva")
    for (item in list) {
        println("item = $item")
    }

    for ((index, item) in list.withIndex()) {
        println("index = $index, item = $item")
    }


    val array = arrayOf("Victor", "Lima", "Silva")
    for (item in array) {
        println("item = $item")
    }

    for (index in array.indices) {
        println("index = $index : item = ${array[index]}")
    }

    for ((index, item) in array.withIndex()) {
        println("index = $index, item = $item")
    }
}