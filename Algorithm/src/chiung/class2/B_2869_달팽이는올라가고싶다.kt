package chiung.class2

import java.util.Scanner

/**
 * A : 낮미터
 * B : 밤 미터
 * V : 높이
 */
fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val v = sc.nextInt()

    print(getTotalDay(a, b, v))
}

fun getTotalDay(a: Int, b: Int, v: Int): Int{
    return if (v <= a) {
        1 // 하루 만에 도달할 수 있는 경우
    } else {
        // 마지막 날을 제외한 거리 (v - a)를 하루에 이동 가능한 거리 (a - b)로 나눠서,
        // 마지막 날 전까지 필요한 정확한 날 수를 계산
        val days = (v - a) / (a - b)

        // 나머지가 있으면 마지막 날 하루 더 필요
        days + if ((v - a) % (a - b) == 0) 1 else 2
    }
}