package challenges

fun climbingLeaderboard(ranked: Array<Int>, player: Array<Int>): Array<Int> {
    var newRank = ranked.toSet()
    val positions: MutableList<Int> = mutableListOf()

    for (score in player) {
//        println("-------------------------- SCORE NOW IS $score")
//        println("new RANK before")
//        newRank.map { println(" > $it") }

        for ((index, value) in newRank.withIndex()) {
            if (score >= value) {
//                println("true at index $index")
                positions.add(index + 1)

                var itemsB = newRank.toList().subList(0, index)
                val before: Set<Int> = itemsB.map { it }.toSet()
//                println("this is subarray before")
//                println(before.map { it })


                val number = setOf(score)


                var itemsA = newRank.toList().subList(index, newRank.size)
                val after = itemsA.map { it }.toSet()
//                println("this is subarray after")
//                println(after.map { it })


                newRank = before + number + after
                break
            } else if (score < value && index == newRank.size-1) {
                positions.add(newRank.size+1)
                newRank += setOf(score)
                break
            }

        }

//        println("new RANK after")
//        newRank.map { println(" $it,") }
//
//        println("position of $score is ${newRank.indexOf(score)}")
    }

        TODO("MUST IMPROVE PERFORMANCE")
    //return positions.toTypedArray()
}

fun climbingLeaderboardTesting(ranked: Array<Int>, player: Array<Int>): Array<Int> {
    var newRank = linkedSetOf<Int>()
    ranked.map { newRank.add(it) }
    newRank.sortedDescending()

    val positions: MutableList<Int> = mutableListOf()


    for (number in player) {
        println("--------------------------")
        println("new RANK before")
        newRank.map { print(" $it,") }

        newRank.add(number)
        println("new RANK after")
        newRank.map { print(" $it,") }


        println("position of $number is ${newRank.indexOf(number)}")

        positions.add(newRank.sortedDescending().indexOf(number) + 1)
    }

    return positions.toTypedArray()
}