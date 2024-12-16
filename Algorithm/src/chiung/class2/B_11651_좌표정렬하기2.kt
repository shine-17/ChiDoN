package chiung.class2

import java.util.*

/**
 * 2차원 평면 위의 점 N개가 주어진다. 좌표를 x좌표가 증가하는 순으로, x좌표가 같으면 y좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.
 */

fun main() {
    val sc = Scanner(System.`in`)
    val inputLength = sc.nextInt()

    val inputNum = Array(inputLength) { Pair(sc.nextInt(), sc.nextInt()) }

    inputNum.sortWith(compareBy({ it.second }, { it.first }))

    for (i in inputNum){
        println("${i.first} ${i.second}")
    }
}
