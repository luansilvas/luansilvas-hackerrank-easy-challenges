package challenges

import kotlin.math.absoluteValue


/**
 * @see <a href="https://www.hackerrank.com/challenges/cats-and-a-mouse/problem">cat and mouse</a>
 */
fun catAndMouse(x: Int, y: Int, z: Int): String {
    val resultA = "Cat A"
    val resultB = "Cat B"
    val MouseC = "Mouse C"

    val diffA = (z - x).absoluteValue
    val diffB = (z - y).absoluteValue

    if (diffA < diffB) return resultA
    if (diffB < diffA) return resultB

    return MouseC
}