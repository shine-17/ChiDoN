package chiung.class2

import java.io.BufferedReader
import java.io.InputStreamReader

/**
 5
 4 1 5 2 3
 5
 1 3 7 9 5
 */

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val inputX = br.readLine().toInt()
    val listX = br.readLine().split(" ").map { it.toInt() }.toIntArray().toHashSet() // -> toHash로 안바꾸면 시간초과 됨 ㅋㅋ

    val inputY = br.readLine().toInt()
    val listY = br.readLine().split(" ").map { it.toInt() }.toIntArray()

    val result = StringBuilder()

    for(i in 0..< inputY){
        if(listX.contains(listY[i])){
            result.append("1\n")
        }else
            result.append("0\n")
    }

    print(result)
}
