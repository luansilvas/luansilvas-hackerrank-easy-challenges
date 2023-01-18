package challenges


/**
 * @see <a href="https://www.hackerrank.com/challenges/utopian-tree/problem">Utopian Tree</a>
 */
fun utopianTree(n: Int): Int {
    if (n == 0) return 1
    if (n == 1) return 2

    var height = 2
    for (period in 2..n) {
        if (period % 2 == 0){
            println(" periodo par $period altura $height")
            height += 1
        }
        else{
            println("periodo impar $period altura $height")
            height *= 2
        }
    }
    return height
}