package challenges


/**
 * @see <a href="https://www.hackerrank.com/challenges/find-digits/problem">find digits</a>
 */
fun findDigits(n: Int): Int {
    var contDivisors = 0

    val nText = n.toString().toCharArray()
    for (pos in nText.indices) {
        val number = Integer.parseInt(nText[pos].toString())
        if (number != 0) {
            if ((n % number) == 0) {
                contDivisors++
            }
        }
    }
    return contDivisors
}