package challenges

/**
 * @see <a href="https://www.hackerrank.com/challenges/counting-valleys/problem">Counting Valleys</a>
 */
fun countingValleys(steps: Int, path: String): Int {
    // Write your code here
    var seaLevel = 0
    var countingValleys = 0
    for (path in path) {
        if (path == 'D') {
            if (seaLevel >= 0 && (seaLevel-1)<0) countingValleys++
            seaLevel--
        }
        if (path == 'U') seaLevel++
    }

    return countingValleys
}