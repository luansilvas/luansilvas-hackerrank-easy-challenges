package challenges


/**
 * @see <a href="https://www.hackerrank.com/challenges/migratory-birds/problem">Migratory Birds</a>
 */
fun migratoryBirds(arr: Array<Int>): Int {
    val contAppearances = mutableMapOf<Int, Int>()
    arr.forEach { num ->
        if (contAppearances[num] != null) contAppearances[num] = contAppearances[num]!! + 1
        else contAppearances[num] = 1
    }
    val maxByNow = contAppearances.maxByOrNull { it.value }!!.key

    return contAppearances.filter {
        it.value >= contAppearances[maxByNow]!!
    }.keys.minOrNull()!!


}