//package chiung.class2
//
//import java.util.*
//
///**
// * 5의 배수의 개수
// * 25의 배수의 개수
// * 125의 배수의 개수를 다 더하면 끝에 붙는 0의 개수를 구할 수 있다.
// *
// * 5! = 5 × 4 × 3 × 2 × 1 = 120
// * 10! = 10 × 9 × 8 × ... × 2 × 1 = 3628800
// *
// * 87 ÷ 5 = 17
// * 87 ÷ 25 = 3
// * 87 ÷ 125 = 0
// * 17 + 3 + 0 = 20
// *
// * 87! -> 0000000000000000
// */
//
//fun main() {
//    val sc = Scanner(System.`in`)
//    val inputNum = sc.nextInt()
//
//    println(findValue(inputNum))
//}
//
//fun findValue(n: Int): Int{
//    val num1 = n / 5
//    val num2 = n / 25
//    val num3 = n / 125
//
//    return num1 + num2 + num3
//}