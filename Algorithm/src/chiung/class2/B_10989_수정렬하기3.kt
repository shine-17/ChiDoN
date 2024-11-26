package chiung.class2

import java.io.BufferedReader
import java.io.InputStreamReader

/**
 * scanner -> buffer로 변경
 * list -> IntArray로 변경
 * StringBuilder -> print할 값들 한번에 담아놓고 print하기 위해서 사용
 */

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()

    val numList = IntArray(n) { br.readLine().toInt() }
    numList.sort()

    val result = StringBuilder()
    for (i in numList){
        result.append(i).append('\n')
    }

    print(result)
}