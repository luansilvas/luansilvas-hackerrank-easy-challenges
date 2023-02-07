package challenges


/**
 * @see <a href="https://www.hackerrank.com/challenges/picking-numbers/problem">Picking Numbers</a>
 */
fun pickingNumbers(a: Array<Int>): Int {
    // Write your code here
    val quantityByNumber = a.groupBy { it }
    val uniqueNumbers = a.toSet().toList()

    var biggestSubArray: Int = quantityByNumber.values.maxByOrNull { it.size }!!.size

    for (number in uniqueNumbers) {
        if (uniqueNumbers.contains(number + 1)) {
            val firstArrayBigger = quantityByNumber[number]!!.size
            val secondArrayBigger = quantityByNumber[number + 1]!!.size

            if ((firstArrayBigger + secondArrayBigger) > biggestSubArray) biggestSubArray =
                firstArrayBigger + secondArrayBigger

        }

    }

    return biggestSubArray
}

