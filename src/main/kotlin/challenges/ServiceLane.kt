package challenges


/**
 * @see <a href="https://www.hackerrank.com/challenges/service-lane/problem">Service Lane</a>
 */
fun serviceLane(n: Int, cases: Array<Array<Int>>, width: Array<Int>): Array<Int> {
    // Write your code here
    val result = mutableListOf<Int>()
    for (list in cases) {
        var minor = width.maxOrNull()!!
        for (number in list[0]..list[1]) {
            if (width[number] < minor) minor = width[number]
        }
        result.add(minor)
    }

    return result.toTypedArray()
}