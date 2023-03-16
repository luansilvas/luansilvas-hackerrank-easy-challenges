package challenges

import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class JumpingOnTheCloudsRevisitedKtTest{

    @Test
    fun `example - should calculate the remaining energy successfully`(){
        val clouds = arrayOf(0,0,1,0)

        val result = jumpingOnClouds(clouds,2)

        val expected = 96

        assertEquals(expected, result)

    }

    @Test
    fun `case 0 - should calculate the remaining energy successfully`(){
        val clouds = arrayOf(1, 1, 1, 0, 1, 1, 0, 0, 0, 0)

        val result = jumpingOnClouds(clouds,3)

        val expected = 80

        assertEquals(expected, result)

    }

    @Test
    fun `case 1 - should calculate the remaining energy successfully`(){
        val clouds = arrayOf(0, 0, 1, 0, 0, 1, 1, 0)

        val result = jumpingOnClouds(clouds,2)

        val expected = 92

        assertEquals(expected,result)

    }

    @Test
    fun `case 2 - should calculate the remaining energy successfully`(){
        val clouds = arrayOf(1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1)

        val result = jumpingOnClouds(clouds,19)

        val expected = 97

        assertEquals(expected,result)

    }


}
