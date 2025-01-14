package chiung.class2

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val inputNum =  br.readLine().toInt()
    val stack = Stack<Int>()
    var index = 0

    while (index != inputNum) {
        val input = br.readLine().toInt()

        when (input) {
            0 -> stack.pop()
            else -> stack.push(input)
        }

        index++
    }
    println(stack.sum())
}