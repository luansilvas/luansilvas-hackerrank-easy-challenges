package challenges

import kotlin.math.abs

/**
 * @see <a href="https://www.hackerrank.com/challenges/drawing-book/problem">Drawing Book</a>
 */
fun pageCount(n: Int, p: Int): Int {
    // Write your code here
    val diffEnd: Int = if ((n - p) == 1 && n%2==0) 1
    else abs(n - p) / 2
    val diffBeginning: Int = Math.abs(p) / 2


    return if (diffEnd < diffBeginning) diffEnd
    else diffBeginning


}