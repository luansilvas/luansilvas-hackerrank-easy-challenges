package challenges

/**
 * @see <a href="https://www.hackerrank.com/challenges/equality-in-a-array/problem">Equalize the Array</a>
 */

fun equalizeArray(arr: Array<Int>): Int {
    val groupedBy = arr.groupBy { it }.toMutableMap()

    var mustOccurrences = 0 to 0

    groupedBy.forEach { key ->
        if (key.value.size > mustOccurrences.second) mustOccurrences = key.key to key.value.size
    }
    groupedBy.remove(mustOccurrences.first)

    var mustDelete = 0

    groupedBy.forEach { key ->
        mustDelete += key.value.size
    }

    return mustDelete
}