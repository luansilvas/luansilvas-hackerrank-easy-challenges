@file:Suppress("NAME_SHADOWING")

package challenges


/**
 * @see <a href="https://www.hackerrank.com/challenges/sock-merchant/problem">Sales by Match</a>
 */
fun sockMerchant(ar: Array<Int>): Int {
    val possiblePair = ar.distinct()
    var pairs = 0
    possiblePair.forEach { possiblePair ->
        ar.count { originalNum ->
            possiblePair == originalNum
        }.apply {
            pairs += (this / 2)
        }
    }
    return pairs
}