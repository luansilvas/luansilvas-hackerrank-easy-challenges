package challenges


/**
 * @see <a href="https://www.hackerrank.com/challenges/divisible-sum-pairs/problem">divisible sum pair</a>
 */
fun divisibleSumPairs(n: Int, k: Int, ar: Array<Int>): Int {

    var contPairs = 0

    for ((i, _) in ar.withIndex()){
        for ((j, _) in ar.withIndex()){
            if (i < j){
                val isDivisible = (i+j) % k
                if (isDivisible == 0)contPairs++
            }
        }
    }

    return contPairs
}