package chiung.class2

import java.util.*

/**
 * FizzBuzz 규칙에 따라 연속된 3개의 숫자가 모두 문자열("Fizz", "Buzz", "FizzBuzz")로만 구성되는 경우는 없다.
 */
fun main() {
    val sc = Scanner(System.`in`)
    val input1 = sc.next()
    val input2 = sc.next()
    val input3 = sc.next()

    print(findString(input1, input2, input3))
}

fun findString(input1: String, input2: String, input3: String): Any{
    val value1 = input1.toIntOrNull()
    val value2 = input2.toIntOrNull()
    val value3 = input3.toIntOrNull()

    return if(value1 != null)
        checkValue(value1 + 3)
    else if(value2 != null)
        checkValue(value2 + 2)
    else
        checkValue(value3!! + 1)
}

fun checkValue(checkValue: Int): Any{
    return if(checkValue % 3 == 0 && checkValue % 5 == 0)
        "FizzBuzz"
    else if(checkValue % 3 == 0)
        "Fizz"
    else if(checkValue % 5 == 0)
        "Buzz"
    else
        checkValue
}