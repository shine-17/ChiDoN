package chiung.class2

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val inputNum =  br.readLine().toInt()
    val queue: Queue<Int> = LinkedList()
    var index = 0


    while (index != inputNum) {
        val input = br.readLine().split(" ")

        when (input[0]) {
            "push" -> queue.add(input[1].toInt())
            "pop" -> if(queue.isEmpty()) println(-1) else println(queue.poll())
            "size" -> println(queue.size)
            "empty" -> if(queue.isEmpty()) println(1) else println(0)
            "front" -> if(queue.isEmpty()) println(-1) else println(queue.peek())
            "back" -> if(queue.isEmpty()) println(-1) else println(queue.last())
        }
        index++
    }
}