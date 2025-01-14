package chiung.class2

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.ArrayDeque

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val inputNum = br.readLine().toInt()

    repeat(inputNum) {
        val (n, m) = br.readLine().split(" ").map { it.toInt() }
        val num = br.readLine().split(" ").map { it.toInt() }
        var printer = 0

        val queue = ArrayDeque<Pair<Int, Int>>()

        for (i in 0 until n) {
            queue.add(i to num[i])
        }


        while (queue.isNotEmpty()) {
            val maxPriority = queue.maxOf { it.second }

            if (queue.first().second == maxPriority) {
                val current = queue.removeFirst()
                printer++

                if (current.first == m) {
                    println(printer)
                    break
                }
            } else {
                // 중요도가 낮으면 맨 뒤로 보냄
                queue.add(queue.removeFirst())
            }
        }
    }
}

