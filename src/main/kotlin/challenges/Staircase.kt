/**
 * @see <a href="https://www.hackerrank.com/challenges/staircase/problem">Staircase</a>
 */
fun staircase(n: Int) {
    // Write your code here

    (1..n).forEach { number ->
        var text = ""
        repeat(n - number) { text+=" " }
        repeat(number) { text+="#" }

        println(text)
    }
}