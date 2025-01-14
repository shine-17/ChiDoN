package chiung.class2

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

/**
 * () [] 균형 어쩌구
 */
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    while (true) {
        val input = br.readLine()
        val stack = Stack<Char>()
        var isError = false

        if (input == ".") break
        // input = ([ (([( [ ] ) ( ) (( ))] )) ]).
        for (item in input) {
            when (item) {
                '(', '[' -> stack.push(item)
                ')' -> {
                    if (stack.isEmpty() || stack.pop() != '(') {
                        isError = true
                        break
                    }
                }
                ']' -> {
                    if (stack.isEmpty() || stack.pop() != '[') {
                        isError = true
                        break
                    }
                }
            }
        }

        if (!isError && stack.isEmpty()) {
            println("yes")
        } else {
            println("no")
        }
    }
}