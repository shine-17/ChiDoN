package chiung.class2

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

/**
 * 올바른 괄호 : VPS
 */
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val inputNum =  br.readLine().toInt()
    var index = 0

    while (index != inputNum) {
        val input = br.readLine()
        val stack = Stack<Char>()
        var isVPS = false

        if (input == ".") break

        for (item in input) {
            when (item) {
                '(' -> stack.push(item)
                ')' -> {
                    if (stack.isEmpty() || stack.pop() != '(') {
                        isVPS = true
                        break
                    }
                }
            }
        }

        if (!isVPS && stack.isEmpty()) {
            index++
            println("YES")
        } else {
            index++
            println("NO")
        }
    }
}