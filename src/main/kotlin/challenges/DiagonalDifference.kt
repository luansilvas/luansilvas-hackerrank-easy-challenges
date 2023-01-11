package challenges

import kotlin.math.abs

/**
 * @see <a href="https://www.hackerrank.com/challenges/diagonal-difference/problem">Diagonal Difference</a>
 */
fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var leftToRightDiagonal = 0
    var rightToLeftDiagonal = 0

    var rightLastPos = (arr[0].size) - 1
    for ((leftLastPos, i) in arr.indices.withIndex()) {
        leftToRightDiagonal += arr[i][leftLastPos]
        rightToLeftDiagonal += arr[i][rightLastPos]
        rightLastPos--
    }
    return abs(leftToRightDiagonal - rightToLeftDiagonal)
}
