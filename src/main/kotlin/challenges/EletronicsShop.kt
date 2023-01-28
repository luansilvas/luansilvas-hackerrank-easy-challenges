package challenges


/**
 * @see <a href="https://www.hackerrank.com/challenges/electronics-shop/problem">Electronics Shop</a>
 */
fun getMoneySpent(keyboards: Array<Int>, drives: Array<Int>, b: Int): Int {

    var biggestBudget = -1

    for (keyboard in keyboards) {
        for (drive in drives) {
            val summing = keyboard + drive
            if (summing in (biggestBudget + 1)..b) biggestBudget = summing
        }
    }

    return biggestBudget
}