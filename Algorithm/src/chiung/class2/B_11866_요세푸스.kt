package chiung.class2

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.ArrayDeque

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
//    val (n, k) = br.readLine().split(" ").map { it.toInt() }
    val queue = ArrayDeque<Int>()
    val result = mutableListOf<Int>()

    val input = br.readLine().split(" ").map { it.toInt() }
    val n = input[0]
    val k = input[1]

    for (i in 1..n) {
        queue.add(i)
    }

    while (queue.isNotEmpty()) {
        for(i in 0 until k-1){
            queue.add(queue.removeFirst())
        }
        result.add(queue.removeFirst())
    }

    println(result.joinToString(prefix = "<", postfix = ">", separator = ", "))
}
