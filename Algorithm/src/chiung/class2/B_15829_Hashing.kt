package chiung.class2

import java.util.*

/**
 * 해시 : 임의의 길이의 입력을 받아서 고정된 길이의 출력을 내보내는 함수로 정의
 * 예제 : abcde의 해시 값은 1 × 31^0 + 2 × 31^1 + 3 × 31^2 + 4 × 31^3 + 5 × 31^4 = 1 + 62 + 2883 + 119164 + 4617605 = 4739715
 * R : 알파벳 총 개수인 26보다 큰 소수인 31로 정의
 * M : 걍 짱큰 소수 ( 해시 충돌 방지 용 )
 * powerOf31 : 거듭 제곱 용
 * %M 의 의미 : %M 을 사용해서 큰 수를 다룰 때 오버플로우 방지, 항상 일정 범위 내의 값만 유지하기 위한 목적.
 */

const val R = 31
const val M = 1234567891

fun main() {
    val sc = Scanner(System.`in`)
    val l = sc.nextInt()
    val input = sc.next()

    var result = 0L
    var powerOf31 = 1L

    input.forEach { char ->
        val charValue = char - 'a' + 1
        result = (result + (charValue * powerOf31) % M) % M
        powerOf31 = (powerOf31 * R) % M
    }

    println(result)
}
