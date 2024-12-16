package chiung.class2

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = br.readLine().toInt()
    val queue: Queue<Int> = LinkedList()

    for(i in 1..input){
        queue.add(i)
    }

    while (queue.size > 1){
        queue.poll()              // poll -> 제일 앞에 있는 요소를 제거
        queue.add(queue.poll())   // 그 다음 요소 제거 후 그 값을 맨 뒤에 추가
    }

    print(queue.peek())           // 제일 앞에 있는 요소 출력
}