fun main(){
    println(getMaxNumber(8,9))
}
fun getMaxNumber(first: Int, second: Int): Int{
    return if(first>second){
        first
    } else{
        second
    }
}
/*
fun getMaxNumber(number1: Int, number2: Int){
    val maximumNumber = if(number1>number2){
        first
    } else {
        second
    }
    return maximumNumber
}
 */