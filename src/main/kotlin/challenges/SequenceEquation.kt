package challenges


/**
 * @see <a href="https://www.hackerrank.com/challenges/angry-professor/problem">Sequence Equation</a>
 */
fun permutationEquation(p: Array<Int>): Array<Int> {
    val list = mutableListOf<Int>()
    for (x in 1 .. p.size) {
        val positionOfX = p.indexOf(x)+1
        val y = p.indexOf(
            positionOfX
        )+1
        list.add(y)
    }
    return list.toTypedArray()
}