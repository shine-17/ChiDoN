package chiung.class2

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.ArrayDeque

/**
 * inputNum : 테스트 케이스 수
 * n : 문서의 개수
 * m : 몇 번째 자리가 중요한 값인지
 */
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val inputNum = br.readLine().toInt()

    repeat(inputNum) {
        val (n, m) = br.readLine().split(" ").map { it.toInt() }
        val num = br.readLine().split(" ").map { it.toInt() }
        var index = 0

        val queue = ArrayDeque<Pair<Int, Int>>()

        for (i in 0 until n) {
            queue.add(i to num[i])
        }


        while (queue.isNotEmpty()) {
            val maxNum = queue.maxOf { it.second }

            if (queue.first().second == maxNum) {
                val current = queue.removeFirst()
                index++

                if (current.first == m) {
                    println(index)
                    break
                }
            } else {
                queue.add(queue.removeFirst())
            }
        }
    }
}
