package challenges

/**
 * @see <a href="https://www.hackerrank.com/challenges/icecream-parlor/problem">Ice Cream Parlor</a>
 */
fun iceCreamParlor(m: Int, arr: Array<Int>): Array<Int> {
    for ((index,value) in arr.withIndex()) {
        for (pos in index+1 until arr.size) {
            if (value+arr[pos] == m){
                return arrayOf(index+1,pos+1).sortedArray()
            }
        }
    }

    return emptyArray()
}