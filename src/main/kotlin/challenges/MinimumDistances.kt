package challenges

/**
 * @see <a href="https://www.hackerrank.com/challenges/minimum-distances/problem">Minimum Distances</a>
 */
fun minimumDistances(a: Array<Int>): Int {
    // Write your code here

    val grouped = a.groupBy { it }
    return if (!grouped.values.any { it.size > 1 }) -1
    else {
        var result = a.size

        grouped.filter { it.value.size > 1 }.forEach { key, _ ->
            val operation = Math.abs(a.indexOfFirst { it == key } - a.indexOfLast { it == key })
            if (operation < result) result = operation
        }

        result
    }
}