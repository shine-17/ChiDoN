package chiung.class2

import java.util.*

/**
 * 방들은 6의 배수로 증가 한다.
 * 2번 쨰 방 2 ~ 7
 * 3번 째 방 8 ~ 19
 * 4번 재 방 20 ~ 37
 * ...
 */
fun main() {
    val sc = Scanner(System.`in`)
    val inputNum = sc.nextLine()
    var roomCount = 1
    var roomNum = 1

    while (roomCount < inputNum.toInt()){
        roomCount += 6 * roomNum
        roomNum++
    }

    println(roomNum)
}