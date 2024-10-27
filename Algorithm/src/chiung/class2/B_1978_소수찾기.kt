package chiung.class2

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()

    var resultCount = 0

    for (i in 1..n) {
        val num = scanner.nextInt()
        if (result(num)) resultCount++
    }

    println(resultCount)
}

fun result(n: Int): Boolean {
    if (n < 2) return false

    for (i in 2..Math.sqrt(n.toDouble()).toInt()) {
        if (n % i == 0) return false
    }

    return true
}