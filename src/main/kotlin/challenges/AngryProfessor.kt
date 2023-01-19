package challenges

import kotlin.math.absoluteValue


/**
 * @see <a href="https://www.hackerrank.com/challenges/angry-professor/problem">Angry Professor</a>
 */
fun angryProfessor(k: Int, a: Array<Int>): String {
    return if (a.filter { it<=0 }.size >= k) "NO"
    else "YES"
}