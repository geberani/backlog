/*
fun main(){
    val matrix = arrayOf(
            intArrayOf(1,2,3),
            intArrayOf(4,5,6),
    )
    for (row in matrix){
        for (column in row){
            if(column == 2) continue
            print("$column")
        }
        println()
    }
}*/

fun main(){
    val matrix = arrayOf(
            intArrayOf(1,2,3),
            intArrayOf(4,5,6),
    )
    outer@ for (row in matrix) {
        for (column in row) {
            if (column ==2) continue@outer
            print("$column")
        }
        println()
    }
}