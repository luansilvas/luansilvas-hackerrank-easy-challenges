package challenges

/**
 * @see <a href="https://www.hackerrank.com/challenges/strange-code/problem">Strange Counter</a>
 */
fun strangeCounter(t: Long): Long {
    // Write your code here

    var initial = 3L
    var aux = initial
    for (number in 1..t) {
        println("time now is $number and aux is $aux")
        if (aux < 1L) {
            aux = initial * 2
            initial = aux

        }
        if (number < t){
            aux--
        }
    }
    return aux
}