fun main() {
/*    val names: Array<String> = arrayOf("ivy", "tom", "ace", "dan")
    for (name in names) {
        println(name)
    }*/

/*    val names: Array<String> = arrayOf("mount","james","kepa","silva")
    for (index in 0 until names.size){
        println("이름: ${names[index]}")
    }*/

    val names: Array<String> = arrayOf("man utd","chelsea","man city","liverpool", "new castle", "westham")
    for(index in (names.size-1) downTo 0 step 2){
        println("구단명 : ${names[index]}")
    }
}