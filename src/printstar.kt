/**
 * Exercise 2.
 * 양의 정수인 line을 파라미터로 받아 별(*)을 다음과 같이 출력한다.
 *
 * Solution 1. 반복문을 활용한다.
 *
 * ex) line = 1
 *     *
 *
 *     line = 2
 *     *
 *     **
 *
 *     line = 3
 *
 *     *
 *     **
 *     ***
 *
 *     line = 4
 *     *
 *     **
 *     ***
 *     ****
 *
 * Solution 2. 재귀를 활용하여 계단을 뒤집어 출력한다.
 *             ** 재귀란? **
 *             자기 자신을 호출하는 함수를 재귀함수라고 한다.
 *             재귀 함수는 두 가지 영역으로 구성된다.
 *             Base case : 재귀 호출을 중지하는 조건을 기술하는 영역
 *             Recursive case : 자기 자신을 호출하는 영역
 *
 * ex) line = 1
 *     *
 *
 *     line = 3
 *     ***
 *     **
 *     *
 *
 *     line = 5
 *     *****
 *     ****
 *     ***
 *     **
 *     *
 */

/*
fun main(){
    printStars(5)
}



fun printStars(line: Int){
    for(l in 1 until line+1){
       println("line = ${l}") 
        for(n in 1 until l+1){
            val str: String = "*".repeat(n)
            println(str)
        }
        println()
    }
}*/

fun main(){
    printStars(5)
}
 fun printStars(l: Int) {
     for (line in 1 until (l + 1)) {
         printStars(l - 1)
         if (line == l) {
             println("*".repeat(l))
         } else {
         }
     }
 }