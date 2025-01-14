package chiung.class2

import java.io.BufferedReader
import java.io.InputStreamReader

/**
 * M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1 ≤ M ≤ N ≤ 1,000,000) M이상 N이하의 소수가 하나 이상 있는 입력만 주어진다.
 *
 * 출력
 * 한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.
 *
 */
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val result = StringBuilder()

    val input = br.readLine().split(" ").map { it.toInt() }
    val n = input[0]
    val k = input[1]

    for (i in n..k) {
        if (result2(i)) {
            result.append(i).append('\n')
        }
    }

    println(result)
}

/**
 *  에라토스테네스의 체
 */
fun result2(n: Int): Boolean {
    if (n < 2) return false

    for (i in 2..Math.sqrt(n.toDouble()).toInt()) {
        if (n % i == 0) return false
    }

    return true
}
