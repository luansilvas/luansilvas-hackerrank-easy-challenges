package challenges

import kotlin.math.abs


/**
 * @see <a href="https://www.hackerrank.com/challenges/save-the-prisoner/problem">Save the Prisoner!</a>
 */
fun saveThePrisoner(n: Int, m: Int, s: Int): Int {

    val rounds: Int = m.div(n)

    println("voltas p dar $rounds")
    if (rounds > 1){
        val result = ((m-(n*rounds))+s)-1
        println("O resultado da operação foi $result")

        return result
    } else{
        println("numero de biscoitos menor que o de prisioneiros ")
        return s+(m-1)
    }

        return s
}