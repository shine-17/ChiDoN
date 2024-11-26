package chiung.class2

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

/**
 * 이항 계수 : 두 자연수 n과 k에 대해, n개의 원소 중에서 k개의 원소를 선택하는 방법의 수
 * (n k) = (n -1 k -1) +  (n -1 k)
 * * n == k && k == 0 이면 이항 계수는 1이다.
 */
fun main() {
//    val br = BufferedReader(InputStreamReader(System.`in`))
//    val n = br.readLine().toInt()
//    val k = br.readLine().toInt()

    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val k = sc.nextInt()

    print(findValue(n, k))
}

fun findValue(n: Int, k: Int): Int{
    return if(n != k && k != 0 && n != 0){
        findValue(n -1, k -1) + findValue(n -1, k)
    }else 1
}