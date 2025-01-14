package chiung.class2

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.collections.ArrayDeque

/**
 * 절사평균 : 가장 큰 값과 가장 작은 값 제외하고 평균
 * 30% 절사평균의 경우 위에서 15% 아래서 15% 제외하고 평균
 */
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val inputNum =  br.readLine().toInt()
    val queue = ArrayDeque<Int>()
    var sum = 0

    repeat(inputNum) {
        queue.add(br.readLine().toInt())
    }

    queue.sort()
//    queue.removeFirst()
//    queue.removeLast()

    val cutLine = Math.round(inputNum * 0.15).toInt()

    for (i in cutLine until inputNum - cutLine) {
        sum += queue[i]
    }

    println(Math.round(sum.toDouble() / (inputNum - cutLine * 2)).toInt())
}
