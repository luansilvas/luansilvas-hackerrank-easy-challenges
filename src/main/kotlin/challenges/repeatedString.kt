package challenges

import java.math.BigInteger

/**
 * @see <a href="https://www.hackerrank.com/challenges/repeated-string/problem">Repeated Strings</a>
 */
fun repeatedString(s: String, n: Long): Long {
    var diffSize = n % s.length
    val nInt: BigInteger = n.toBigInteger()
    val times: BigInteger = nInt / s.length.toBigInteger()
    val remaining = s.subSequence(0, diffSize.toInt())

    val asFound = ((s.filter { it == 'a' }.length).toBigInteger() * times).toLong()
    val asFoundDiff = ((remaining.filter { it == 'a' }.length)).toLong()

    return asFound + asFoundDiff
}

@Deprecated("This is algorithm does not perform well on big inputs. Use repeatedString instead.")
fun repeatedStringOld(s: String, n: Long): Long {
    var newLetter = s
    var letterSize = s.length

    while (letterSize < n) {
        if ((newLetter.length + s.length) < n) {
            newLetter += s
            letterSize += s.length
        } else {
            val letter = s.subSequence(0, (n - newLetter.length).toInt())
            newLetter += letter
            letterSize += letter.length

        }
        println("Palavra agora $newLetter")
    }

    println("Palavra repetida $newLetter")

    return 7
    //return newLetter.filter { it == 'a' }.length.toLong()
}