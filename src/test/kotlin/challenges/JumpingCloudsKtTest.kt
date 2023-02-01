package challenges

import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class JumpingCloudsKtTest{

    @Test
    fun `should calculate the path that the least clouds to get to end successfully`(){

        val expected = 4
        val result = jumpingOnClouds(arrayOf(0, 0, 1, 0, 0, 1, 0))

        assertEquals(expected, result)
    }
}