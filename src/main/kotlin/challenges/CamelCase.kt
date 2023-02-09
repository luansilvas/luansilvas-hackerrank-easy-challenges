package challenges

/**
 * @see <a href="https://www.hackerrank.com/challenges/camelcase/problem">CamelCase</a>
 */
fun camelcase(s: String): Int {
    // Write your code here
    return s.count { it.isUpperCase() } + 1
}