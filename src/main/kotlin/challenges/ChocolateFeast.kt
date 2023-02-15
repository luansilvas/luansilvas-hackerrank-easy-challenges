package challenges

/**
 * @see <a href="https://www.hackerrank.com/challenges/chocolate-feast/problem">Chocolate Feast</a>
 */
fun chocolateFeast(n: Int, c: Int, m: Int): Int {
    // Write your code here
    val regular = n.div(c)

    val extra = regular.div(m)

    val remaining:Int  = if (regular % m == 0) 0
    else{
        val remain:Int = regular%m
        (extra+remain).div(m)
    }


    return extra+regular+remaining
}
