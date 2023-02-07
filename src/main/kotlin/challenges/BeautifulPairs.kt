package challenges


/**
 * @see <a href="https://www.hackerrank.com/challenges/beautiful-pairs/problem">Beautiful Pairs</a>
 */
fun beautifulPairs(A: Array<Int>, B: Array<Int>): Int {
    // Write your code here
    val pairs = mutableListOf<Pair<Int, Int>>()
    val mutableB = B.toMutableList()

    for (index in A.indices) {
        if (A[index] in mutableB) {
            val indexB = mutableB.indexOf(A[index])
            pairs.add(index to indexB)
            mutableB[indexB] = -1
        }
    }

    return if (pairs.size<A.size && pairs.size < B.size) pairs.size+1
    else pairs.size-1

}