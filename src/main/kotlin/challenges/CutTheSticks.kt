package challenges

/**
 * @see <a href="https://www.hackerrank.com/challenges/cut-the-sticks/problem">Cut the sticks</a>
 */
fun cutTheSticks(arr: Array<Int>): Array<Int> {
    // Write your code here
    var mutableSticks = arr.toMutableList()
    val result = mutableListOf<Int>()

    var goOn = true
    while (goOn) {
        val minor = mutableSticks.minByOrNull { it }

        result.add(mutableSticks.size)
        mutableSticks = mutableSticks.map { it - minor!! }.toMutableList()
        mutableSticks.removeIf { it <= 0 }

        goOn = mutableSticks.groupBy { it }.keys.isNotEmpty()
    }
    return result.toTypedArray()
}