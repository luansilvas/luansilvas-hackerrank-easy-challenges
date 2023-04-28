package challenges

import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class FlatlandSpaceStationsKtTest{

    @Test
    fun `case 0 - should find the maximum distance between a city and the neares space station`(){
        val result = flatlandSpaceStations(3, arrayOf(1))
        val expected = 1

        assertEquals(expected, result)
    }

    @Test
    fun `case 1- should find the maximum distance between a city and the neares space station`(){
        val result = flatlandSpaceStations(5, arrayOf(0,4))
        val expected = 2

        assertEquals(expected, result)
    }

    @Test
    fun `case 2- should find the maximum distance between a city and the neares space station`(){
        val result = flatlandSpaceStations(6, arrayOf(0, 1, 2, 4, 3, 5))
        val expected = 0

        assertEquals(expected, result)
    }
}