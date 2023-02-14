package challenges

/**
 * @see <a href="https://www.hackerrank.com/challenges/lisa-workbook/problem">Lisa's Workbook</a>
 */
fun workbook(n: Int, k: Int, arr: Array<Int>): Int {
    var result = 0
    var pages = 1

    for (chapter in arr) {
        var remaining = k
        for (exercises in 1..chapter) {
            if (remaining == 0) {
                pages++
                remaining = k
            }
            if (exercises == pages) result++
            remaining--
        }
        pages++
    }



    return result
}
