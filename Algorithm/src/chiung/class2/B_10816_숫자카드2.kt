package chiung.class2

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val inputNum =  br.readLine().toInt()
    val cardList = mutableListOf<Int>()
    val result = StringBuilder()
    var index = 0

    while (index != inputNum) {
        val input = br.readLine().split(" ")
        for(i in input){
            cardList.add(i.toInt())
        }
        index = input.size
    }

    val inputNum2 =  br.readLine().toInt()
    var index2 = 0

    while (index2 != inputNum2){
        val input = br.readLine().split(" ")
        for(i in input){
            result.append(
                cardList.count {
                   it == i.toInt()
                }
            ).append(' ')
        }

        index2 = input.size
    }

    println(result)
}