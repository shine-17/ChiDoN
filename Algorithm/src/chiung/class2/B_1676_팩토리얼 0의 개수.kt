//package chiung.class2
//
//import java.util.*
//
///**
// * 5의 배수의 개수
// * 25의 배수의 개수
// * 125의 배수의 개수를 다 더하면 끝에 붙는 0의 개수를 구할 수 있다.
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