package challenges

fun funnyString(s: String): String {
    // Write your code here
    val reverse = s.reversed()

    val asciisOfS: List<Int> = s.map { it.toInt() }
    val asciisOfR: List<Int> = reverse.map { it.toInt() }

    for (index in 0..asciisOfR.size - 2) {

        if (
            Math.abs(asciisOfR[index] - asciisOfR[index + 1])
            !=
            Math.abs(asciisOfS[index] - asciisOfS[index + 1])
            )
            return "Not Funny"


    }

    return "Funny"
}
