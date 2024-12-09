package chiung.class2

/**
 * 나이 낮은 순 + 먼저 입력한 순
 */
import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val inputLength = sc.nextInt()

    val people = Array(inputLength) { i -> Triple(sc.nextInt(), sc.next(), i) }

    people.sortWith(compareBy({ it.first }, { it.third }))

    for (person in people) {
        println("${person.first} ${person.second}")
    }

//    val ages = IntArray(inputLength)
//    val names = Array(inputLength) { "" }
//    val index = IntArray(inputLength) { it }
//
//    for (i in 0 until inputLength) {
//        ages[i] = sc.nextInt()
//        names[i] = sc.next()
//    }
//
//    for (i in 0 until inputLength - 1) {
//        for (j in 0 until inputLength - 1 - i) { // -> 버블 정렬
//            if (ages[j] > ages[j + 1]) {
//
//                val tempAge = ages[j]
//                ages[j] = ages[j + 1]
//                ages[j + 1] = tempAge
//
//                val tempName = names[j]
//                names[j] = names[j + 1]
//                names[j + 1] = tempName
//
//                val tempIndex = index[j]
//                index[j] = index[j + 1]
//                index[j + 1] = tempIndex
//            }
//        }
//    }
//
//    for (i in 0 until inputLength) {
//        println("${ages[i]} ${names[i]}")
//    }
}
