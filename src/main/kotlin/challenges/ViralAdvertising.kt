package challenges


/**
 * @see <a href="https://www.hackerrank.com/challenges/strange-advertising/problem">Viral Advertising</a>
 */
fun viralAdvertising(n: Int): Int {
    var likes = 0
    var shared = 5

    for (day in 1..n) {
        likes += (shared / 2)
        shared = ((shared / 2) * 3)
    }

    return likes
}