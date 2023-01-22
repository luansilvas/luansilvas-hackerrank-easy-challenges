package challenges

fun beautifulDays(i: Int, j: Int, k: Int): Int {
    // Write your code here

    var beautifulDays = 0

    for (number in i..j){
        val reverseNumber = number.toString().reversed().toInt()

        println("$reverseNumber")

        if (((number-reverseNumber)%k==0)) beautifulDays++
    }
    return beautifulDays
}