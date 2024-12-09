package chiung.class2

import java.util.*

/**
 * N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 */
fun main() {
    val sc = Scanner(System.`in`)
    val inputLength = sc.nextInt()
    val numList = List(inputLength) { sc.nextInt() }
    val result = StringBuilder()

    val wordSortToLength = numList
        .distinct()
        .sorted()

//    val wordSortToLength = numList
//        .toMutableSet()
//        .toList()
//        .sorted()

    for (i in wordSortToLength){
        result.append(i).append('\n')
    }

    println(result)
}