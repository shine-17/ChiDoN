package chiung.class2

import java.util.*

/**
 * 힌트
 * 브루트포스 알고리즘 == 완전 탐색
 *
 * 조건
 * N : 카드 개수는 3개 이상 100개 이하
 * N[n] : 카드의 값은 1..100000
 * M : 카드의 합은 10..300000
 *
 * 입력
 * 첫째 줄 입력으로 N장의 카드의 개수와 최대 값 M을 입력 받음
 * 둘째 줄 입력으로 카드의 값을 입력 받음
 *
 * 출력
 * 첫째 줄에 M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합 출력
 */

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val inputListNum = List(n) { sc.nextInt() }
    val result = mutableListOf<Int>()
    var sum = 0

    for(i in inputListNum.indices){
        for(j in i..< inputListNum.size){
            for (k in j..< inputListNum.size){
                if(i != j && j != k) sum = inputListNum[i] + inputListNum[j] + inputListNum[k]
                if(sum <= m) result.add(sum)
            }
        }
    }
    println(result.max())
}