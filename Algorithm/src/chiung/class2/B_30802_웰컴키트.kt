package chiung.class2

import java.util.*

fun main(){
        val scanner = Scanner(System.`in`)
        val shirtSizeList = mutableListOf<Int>()
            val totalNum = scanner.nextInt()

            for(i in 0..5){
                shirtSizeList.add(scanner.nextInt())
            }

            val bundleShirt = scanner.nextInt()
            val bundlePen = scanner.nextInt()
            var resultShirt = 0

//            for(i in shirtSizeList){
//                if(i <= bundleShirt){
//                    resultShirt++
//                }else{
//                    resultShirt += (i / bundleShirt) + 1
//                }
//            }

            for (i in shirtSizeList) {
                resultShirt += (i + bundleShirt - 1) / bundleShirt
            }
            println(resultShirt)

            val penBundles = totalNum / bundlePen
            val remainingPens = totalNum % bundlePen

            println("$penBundles $remainingPens")
//            if(totalNum % bundlePen == 0) {
//                println(totalNum / bundlePen)
//                break
//            }
//            else {
//                print(totalNum / bundlePen)
//                print(" ")
//                print(totalNum % bundlePen)
//                break
//            }
}