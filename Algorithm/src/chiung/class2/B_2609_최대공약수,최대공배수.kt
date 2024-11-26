package chiung.class2

import java.util.Scanner

/**
 * 최대 공약수 : 두 개 이상의 수의 공통된 약수 중에서 가장 큰 수
 * 유클리드 호제법 : 두 수의 최대 공약수는 큰 수에서 작은 수를 나눈 나머지와 작은 수의 최대 공약수와 같다
 *
 * 최소 공배수 : 두 개 이상의 수의 공통된 배수 중에서 가장 작은 수
 *
 * 최대 공약수와 최소 공배수의 관계 : a와 b를 곱한 값이 최대 공약수와 최소 공배수의 곱과 같다.
 *                               a×b = GCD(a,b) × LCM(a,b)
 */
fun main() {
    val sc = Scanner(System.`in`)

    val num1 = sc.nextInt()
    val num2 = sc.nextInt()

    val gcdResult = gcd(num1, num2)
    val lcmResult = lcm(num1, num2)

    println("$gcdResult") // 최대 공약수
    println("$lcmResult") // 최소 공배수
}

// 최대 공약수 (GCD) - 유클리드 호제법
fun gcd(a: Int, b: Int): Int {
    return if (b == 0) a else gcd(b, a % b)
}

// 최소 공배수 (LCM) - 두 수의 곱을 최대 공약수로 나눔 그럼 최소 공배수 나옴
// 왜냐? 최대 공약수 * 최소 공배수가 두 수의 곱이니까
fun lcm(a: Int, b: Int): Int {
    return a * b / gcd(a, b)
}