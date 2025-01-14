package chiung.class2

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.round

/**
 * 산술평균 : N개의 수들의 합을 N으로 나눈 값
 * 중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
 * 최빈값 : N개의 수들 중 가장 많이 나타나는 값
 * 범위 : N개의 수들 중 최댓값과 최솟값의 차이
 *
 * ex) 1, 1, 2, 2, 3, 4, 4
 */
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val numbers = IntArray(n) { br.readLine().toInt() }
    numbers.sort()

    // 산술평균
    val average = round(numbers.average()).toInt()

    // 중앙값
    val middle = numbers[n / 2]

    // 최빈값
    // {1=2, 2=2, 3=1, 4=2}
    val map = numbers.toList().groupingBy { it }.eachCount()

    // 최대 빈도에 해당하는 값 필터
    val max = map.filter { it.value ==  map.maxOf { maxNum -> maxNum.value } }

    val maxSorted = max.keys.sorted()

    val mode = if (maxSorted.size > 1) {
        maxSorted[1]
    } else {
        maxSorted[0]
    }

    // 범위
    val range = numbers.last() - numbers.first()

    println(average)
    println(middle)
    println(mode)
    println(range)
}

