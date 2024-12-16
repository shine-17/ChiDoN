package chiung.class2

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

/**
 * 5킬로그램, 3킬로그램
 */
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var input = br.readLine().toInt()
    var result = 0

    while (input >= 0) {
        if (input % 5 == 0) {
            result += input / 5
            println(result)
//            println("result 5키로 : $result")
            return
        }
        input -= 3
        result++

//        println("input : $input")
//        println("result 3키로 : $result")
    }

    println(-1)
}