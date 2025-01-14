package chiung.class2

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val sb = StringBuilder()

    br.readLine().toInt()

    /**
     * groupingBy와 eachCount 사용
     * ex) groupingBy -> 10 -> [10, 10, 10]
     * ex) eachCount -> 10 to 3
     * ex) cardCounts -> {10=3, 20=1, 30=3}
     */
    val cardCounts = br.readLine()
        .split(" ")
        .map { it.toInt() }
        .groupingBy { it }
        .eachCount()

    br.readLine().toInt()
    val query = br.readLine().split(" ").map { it.toInt() }

    // 결과 계산
    for (num in query) {
        println("num : $num")
        sb.append(cardCounts.getOrDefault(num, 0)).append(" ")
        println("sb : $sb")
    }

    println(sb.toString().trim())
}