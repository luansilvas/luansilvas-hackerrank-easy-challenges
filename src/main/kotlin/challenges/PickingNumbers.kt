package challenges

import kotlin.math.abs


/**
 * @see <a href="https://www.hackerrank.com/challenges/picking-numbers/problem">Picking Numbers</a>
 */
fun pickingNumbersDeprecated(a: Array<Int>): Int {
    // Write your code here
    var biggestsize = 0



    for ((outIndex, outValue) in a.withIndex()) {
        println("----------------------------------")

        println("current biggest array size $biggestsize")

        var currentList = mutableListOf<Int>()
        var sequence = currentList.size

        currentList.add(outValue)
        for ((inIndex, inValue) in a.withIndex()) {

            if (
                (inIndex != outIndex)
            ) {

                val biggerComparingTo = currentList.filter {
                    abs(it - inValue) > 1
                }

                if (biggerComparingTo.isEmpty()) {
                    println("o valor $inValue tem uma diferença de 0 ou 1 pro outros elementos")
                    sequence++
                    currentList.add(inValue)
                } else {
                    val compatibleNumbers = currentList.filter { !(it in biggerComparingTo) }.toMutableList()

                    println("Numeros compatíveis")

                    compatibleNumbers.map { println(">>>> $it") }

                    val isNumberFitable = compatibleNumbers.any {
                        abs(it - inValue) > 1
                    }
                    if (!isNumberFitable) {
                        currentList = compatibleNumbers
                        currentList.add(inValue)
                    }
                }
            }
        }

        println("ARRAY ATÉ AGORA PARTINDO DE $outValue")
        currentList.map { println(">>> $it") }
        if (sequence > biggestsize) {
            biggestsize = sequence
        }

        currentList = mutableListOf()

    }
    return biggestsize

}

fun pickingNumbers(a: Array<Int>): Int {
    // Write your code here
    var biggestsize = 1

    a.map { number ->



        val greatDiff = a.filter { abs(it - number) <= 1 }.toMutableList()

        val mustExclude = mutableListOf<Int>()
        greatDiff.forEach { elementOut ->

            greatDiff.forEach { elementIn ->
                val comparing = abs(elementOut - elementIn) > 1
                if (comparing) mustExclude.add(elementIn)
            }

            println("números a serem excluidos da lista")


        }
        mustExclude.map { println(">>> $it") }
        greatDiff.removeAll(mustExclude)


        if (greatDiff.size > biggestsize)
            biggestsize = greatDiff.size


    }



    return biggestsize

}

