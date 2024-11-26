/*
package chiung.class2

import java.util.*

*/
/**
 * inputNum : 분해합
 * sum : 각 자릿수 더한 값
 * value : 분해합과 같은 값인지 체크하는 값
 * result : 생성자
 *
 * 문제
 * 분해합을 입력 받고 생성자를 구하는데, 그 중 가장 작은 생성자를 구해라.
 *
 * 분해합 : ex) 123 -> 1 + 2 + 3 + 123 = 129
 *
 * 분해합은 항상 생성자보다 크거나 같다.
 *//*

fun main() {
    val sc = Scanner(System.`in`)
    val inputNum = sc.nextLine()
    var result = 0

    for(i in 1..inputNum.toInt()){
        */
/**
         * digitToInt() -> char를 10진수 숫자로 변경
         * string으로 변경 후 각 문자열을 정수로 변경하고 List<Int> 반환
         * ex) i : 123 -> [1, 2, 3]
         *//*

        val sum = i.toString().map { it.digitToInt() }
        val value = sum.sum() + i

        if(inputNum.toInt() == value){
            result = i
        }
    }
    println(result)
}*/
