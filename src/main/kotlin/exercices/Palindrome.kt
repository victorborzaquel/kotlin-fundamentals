package exercices

fun main() {
    val phrases = listOf("civic", "Victor", "level ", "madam", "Hugo", "noon")

    val results = phrases.map {
        isPalindrome(it)
    }

    println("results = $results")
}

fun isPalindrome(phrase: String): Boolean {
    for ((index, item) in phrase.withIndex()) {
        if (item != phrase[phrase.length - index - 1]) {
            return false
        }
    }
    return true
}