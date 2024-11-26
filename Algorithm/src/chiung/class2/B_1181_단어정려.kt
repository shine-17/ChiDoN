package chiung.class2

import java.util.*

/**
 * distinct : 중복 제거
 * sortedWith : 정렬
 * compareBy<String> { it.length } : 문자 길이 정렬
 * thenBy { it }) : 알파뱃 정렬
 */
fun main() {
    val sc = Scanner(System.`in`)
    val inputLength = sc.nextInt()
    val wordList = List(inputLength) { sc.next() }
    val result = StringBuilder()

    val wordSortToLength = wordList
        .distinct()
        .sortedWith(compareBy<String> { it.length }.thenBy { it })

    for (i in wordSortToLength){
        result.append(i).append('\n')
    }

    println(result)
}