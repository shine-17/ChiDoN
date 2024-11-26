package chiung.class2

import java.util.Scanner

/**
 * k : 층 ( 0층부터 14층 )
 * n : 호 ( 1호부터 14호 )
 *
 *    (2)
 *    1   4  10   20  35  56  84  120  165
 *
 *    (1)
 *    1   3   6   10  15  21  28   36   45
 *
 *    (0)
 *    1   2   3    4   5   6   7    8    9
 *
 */
private const val maxNum = 14

fun main() {
    val sc = Scanner(System.`in`)
    val t = sc.nextInt()

    for(i in 0..< t){
        val k = sc.nextInt()
        val n = sc.nextInt()

        if(k != 0){
            println(check(k, n))
        }else
            println(n)
    }
}

fun check(k: Int, n:Int): Int{
    var sum = 0
    var listN = IntArray(maxNum)
    val listN2 = IntArray(maxNum)

    listN2[0] = 1

    // 0번째 방으로 초기화
    for(i in 0..< maxNum){
        listN[i] = i+1
    }

    for(z in 0..<k){
        for(i in 0..< maxNum){
            sum = 0
            for(j in 0..i){
                sum += listN[j]
            }
            listN2[i] = sum
        }
//        listN = listN2
        listN = listN2.copyOf() // 새로운 배열을 생성하여 참조를 바꾸기
//        System.arraycopy(listN2, 0, listN, 0, maxNum) // 기존 배열을 유지하면서 값만 복사
    }

    return listN[n-1]
}