package challenges


/**
 * @see <a href="https://www.hackerrank.com/challenges/fair-rations/problem">Fair Rations</a>
 */
fun fairRations(B: Array<Int>): String {
    // Write your code here

    var loaves = 0
    var result = ""
    var keepGoing = true
    var newLine = B.toMutableList()
    while (keepGoing) {

        val index = newLine.indexOf(newLine.first { it % 2 == 0 })

        if (newLine.filter { it % 2 != 0 }.size == 1) {
            result = "NO"
            keepGoing = false
        }
        if (newLine.none { it % 2 != 0 }) {
            keepGoing = false
            result = loaves.toString()
        }

        when {
            newLine[index + 1] % 2 != 0 -> {
                newLine[index + 1]++
                loaves++

            };
            newLine[index - 1] % 2 == 0 -> {
                newLine[index - 1]++
                loaves++

            }

            else -> {
                if (newLine[index - 1] < newLine[index + 1]){
                    loaves++
                    newLine[index - 1]++
                }
                else {
                    newLine[index + 1]++
                    loaves++
                }

            }

        }
    }

    return result
}