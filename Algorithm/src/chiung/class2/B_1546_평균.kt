package chiung.class2

import java.util.*

/**
 * m : 최댓값
 * 모든 점수 : 점수 / M * 100
 */

fun main() {
    val sc = Scanner(System.`in`)
    val inputLength = sc.nextInt()
    val subjectList = List(inputLength) { sc.nextInt() }
    val m = subjectList.max()
    var avg = 0F

    for(i in subjectList){
        avg += (i.toFloat() / m.toFloat() * 100)
    }

    println(avg / subjectList.size)
}