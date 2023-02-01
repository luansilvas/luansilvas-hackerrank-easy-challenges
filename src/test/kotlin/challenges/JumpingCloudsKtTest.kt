package challenges

import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class JumpingCloudsKtTest{

    @Test
    fun `case 0 - should calculate the path that the least clouds to get to end successfully`(){

        val expected = 4
        val result = jumpingOnClouds(arrayOf(0, 0, 1, 0, 0, 1, 0))

        assertEquals(expected, result)
    }

    @Test
    fun `case 1 - should calculate the path that the least clouds to get to end successfully`(){

        val expected = 3
        val result = jumpingOnClouds(arrayOf(0, 0, 0, 1, 0,0))

        assertEquals(expected, result)
    }
}
