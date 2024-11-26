package chiung.class2

import java.util.*

/**
 * 팰린드롬 : 앞뒤가 똑같은 전화번호
 * 입력 : 마지막엔 0이 주어지고, 0은 문제에 포함 x
 */

fun main() {
    val sc = Scanner(System.`in`)

    while (true){
        val input = sc.nextInt()
        if(input == 0) break

        val inputToString = input.toString()
        val reverseString = inputToString.reversed()

        if(inputToString == reverseString) println("yes") else println("no")
    }
}