package challenges

/**
 * @see <a href="https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited/problem">Jumping on the Clouds: Revisited</a>
 */
fun jumpingOnClouds(c: Array<Int>, k: Int): Int {
    var remainingEnergy = 100
    var keepGoing = true
    var index = k
    remainingEnergy--

    if (c[0] == 1) remainingEnergy -=2

    while (keepGoing){
        remainingEnergy --
        if (c[index] == 1) remainingEnergy -=2

        if(index+k < c.size) index+=k
        else {
            index = k-(c.size-index)
        }
        keepGoing = index != 0
    }



    return remainingEnergy
}