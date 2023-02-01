package challenges

/**
 * @see <a href="https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem">Jumping on the Clouds</a>
 */
fun jumpingOnClouds(c: Array<Int>): Int {
    // Write your code here
    var currentIndex = 0
    var givenJumps = 0


    while (currentIndex < c.size) {
        if (currentIndex < c.size - 2) {
            if (c[currentIndex + 2] == 0) {
                currentIndex += 2
                givenJumps += 1
            } else { //will find thunderheads if we jump 2 clouds
                currentIndex += 1
                givenJumps += 1
            }

        } else {
            if (currentIndex == c.size - 2) { //lets suppose that it doesnt jump two clouds, there will be one missing thats it
                givenJumps += 1
            }
            currentIndex += 1
        }
    }

    return givenJumps
}