@file:Suppress("NAME_SHADOWING")

package challenges

import kotlin.math.abs

fun flatlandSpaceStations(n: Int, c: Array<Int>): Int {
    val distances = mutableListOf<Int>()

    for (compareCity in 0 until n) {
        val distances = mutableListOf<Int>()

        for (compareCity in 0 until n) {
            var closeStationDistance = n

            if (compareCity in c) {
                distances.add(0)
                continue
            }
            for (station in c) {
                val operation = abs(station - compareCity)

                if ((operation < closeStationDistance)) closeStationDistance = operation
            }
            distances.add(closeStationDistance)
        }
    }

    return distances.maxOrNull()!!

}
