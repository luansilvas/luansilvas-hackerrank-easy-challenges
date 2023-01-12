package challenges

import kotlin.math.abs

/**
 * @see <a href="https://www.hackerrank.com/challenges/the-hurdle-race/problem">hurdle race</a>
 */
fun hurdleRace(k: Int, height: Array<Int>): Int {
    var potions = 0
    var increasingJump = k
    for (hurdle in height) {
        if (hurdle > increasingJump) {
            val diff = abs(hurdle - increasingJump)
            potions += diff
            increasingJump += diff
        }
    }
    return potions
}