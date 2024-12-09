package chiung.class2

import java.util.*

/**
 * 키, 몸무게로 등수 출력
 * 몸무게 : x
 * 키 : y
 * 덩치 : (x,y)
 */
fun main() {
    val sc = Scanner(System.`in`)
    val inputLength = sc.nextInt()

    // 키, 몸무게 저장
    val people = Array(inputLength) { Pair(sc.nextInt(), sc.nextInt()) }

    // 등수 계산
    val ranks = IntArray(inputLength) { 1 }

    for (i in 0 until inputLength) {
        for (j in 0 until inputLength) {
            if (i != j
                && people[i].first < people[j].first      // 키
                && people[i].second < people[j].second) { // 몸무게
                ranks[i]++
            }
        }
    }

    for (rank in ranks) {
        print("$rank ")
    }
}