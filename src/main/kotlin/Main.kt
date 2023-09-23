fun main(){
    val numOne = intArrayOf(7,8,8,1,2,3,2,5,4,0)
    val numTwo = intArrayOf(7,5,1,2,8,7,2,9,3)

    val a1 = numOne.toSet()
    val a2 = numTwo.toSet()

    val result = mutableListOf<Int>()

    for (item in a1) {
        if (a2.contains(item)) {
            val numRepeats = minOf(numOne.count { it == item }, numTwo.count{ it == item })
            repeat(numRepeats) { result.add(item) }
        }
    }
    println(result);
}