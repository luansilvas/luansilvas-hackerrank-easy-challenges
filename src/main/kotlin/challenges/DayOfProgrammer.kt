package challenges

/**
 * @see <a href="https://www.hackerrank.com/challenges/day-of-the-programmer/problem">Day of the Programmer</a>
 */
fun dayOfProgrammer(year: Int): String {
    // Write your code here
    val isLeap = if (year < 1919) year % 4 == 0
    else ((year % 400 == 0) || ((year % 100 != 0)&&(year % 4 == 0)))

    if (year==1918) return "26.09.1918"
    return if (isLeap) "12.09.$year"
    else "13.09.$year"
}