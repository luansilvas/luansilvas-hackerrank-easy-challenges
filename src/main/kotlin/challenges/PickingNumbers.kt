package challenges


/**
 * @see <a href="https://www.hackerrank.com/challenges/picking-numbers/problem">Picking Numbers</a>
 */
fun pickingNumbers(a: Array<Int>): Int {
    // Write your code here
    val quantityByNumber = a.groupBy { it }
    val uniqueNumbers = a.toSet().toList()

    println("lista antiga")

    a.map { println(">>> $it") }

    println("lista sem repetir")

    uniqueNumbers.map { println(">>> $it") }


    var biggestSubArray: Int = quantityByNumber.values.maxByOrNull { it.size }!!.size

    for (number in uniqueNumbers) {
        if (uniqueNumbers.contains(number + 1)) {
            val firstArrayBigger = quantityByNumber[number]!!.size
            val secondArrayBigger = quantityByNumber[number + 1]!!.size

            println("tamanho primeiro array ${quantityByNumber[number]!!.size} de chave ${number} e agr do segundo ${quantityByNumber[number + 1]!!.size} de chave ${number + 1}")

            if ((firstArrayBigger + secondArrayBigger) > biggestSubArray) biggestSubArray =
                firstArrayBigger + secondArrayBigger

        }

    }

    return biggestSubArray
}

