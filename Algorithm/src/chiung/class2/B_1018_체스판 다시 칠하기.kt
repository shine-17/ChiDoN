package chiung.class2

import java.util.*

/**
 * 첫째 줄에 N과 M이 주어진다. N과 M은 8보다 크거나 같고, 50보다 작거나 같은 자연수이다.
 * 둘째 줄부터 N개의 줄에는 보드의 각 행의 상태가 주어진다. B는 검은색이며, W는 흰색이다.
 */

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val m = sc.nextInt()
    sc.nextLine()  // 개행 문자 처리

    val board = Array(n) { sc.nextLine() }

    val patterns = arrayOf(
        arrayOf("BWBWBWBW", "WBWBWBWB"),  // 왼쪽 상단이 B인 패턴
        arrayOf("WBWBWBWB", "BWBWBWBW")   // 왼쪽 상단이 W인 패턴
    )

    var minCount = Int.MAX_VALUE

    // 모든 8x8 부분 보드 확인
    for (i in 0..n - 8) {
        for (j in 0..m - 8) {
            // 각 8x8 보드에서 두 패턴과 비교하여 최소값 계산
            val count1 = countRepaints(board, i, j, patterns[0])  // 패턴 1 (왼쪽 상단 B)
            val count2 = countRepaints(board, i, j, patterns[1])  // 패턴 2 (왼쪽 상단 W)

            // 최소 칠해야 할 칸의 수 갱신
            minCount = minOf(minCount, count1, count2)
        }
    }

    println(minCount)
}

// 8x8 보드를 특정 패턴과 비교해 다시 칠해야 할 칸의 수 계산
fun countRepaints(board: Array<String>, startX: Int, startY: Int, pattern: Array<String>): Int {
    var count = 0
    for (i in 0 until 8) {
        for (j in 0 until 8) {
            // 현재 보드의 문자와 패턴의 문자가 다르면 다시 칠해야 함
            if (board[startX + i][startY + j] != pattern[i % 2][j]) {
                count++
            }
        }
    }
    return count
}

