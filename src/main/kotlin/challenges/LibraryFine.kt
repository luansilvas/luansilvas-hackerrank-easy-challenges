package challenges


/**
 * @see <a href="https://www.hackerrank.com/challenges/library-fine/problem">Library Fine</a>
 */
fun libraryFine(d1: Int, m1: Int, y1: Int, d2: Int, m2: Int, y2: Int): Int {

    if (y1 == y2) {
        if (m1 == m2) {
            if (d1 > d2) return (15*(kotlin.math.abs(d1 - d2)))
        }
        if (m1>m2) return (500 * (kotlin.math.abs(m1 - m2)))
    }
    if (y1>y2) return 10000


    return 0
}