package challenges

import kotlin.math.abs


/**
 * @see <a href="https://www.hackerrank.com/challenges/apple-and-orange/problem">Apple and Orange</a>
 */
fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>): Array<Int> {
    // Write your code here
    val appleDistances = apples.map {
        it + a
    }.filter {
        (it >= s) && (it <= t)
    }

    val orangeDistances = oranges.map {
        it + b
    }.filter {
        (it >= s) && (it <= t)
    }
    println("${appleDistances.size}")
    println("${orangeDistances.size}")

    //Added a return expression in order to make it testable
    return arrayOf(appleDistances.size, orangeDistances.size)

}