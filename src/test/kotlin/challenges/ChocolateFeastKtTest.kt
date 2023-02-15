package challenges

import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class ChocolateFeastKtTest{

    @Test
    fun`case 0 - must find the amount of chocolates Brenno can eat`(){
        val expected = 6
        val actual = chocolateFeast(10,2,5)

        assertEquals(expected, actual)
    }

    @Test
    fun`case 1 - must find the amount of chocolates Brenno can eat`(){
        val expected = 3
        val actual = chocolateFeast(12,4,4)

        assertEquals(expected, actual)
    }

    @Test
    fun`case 2 - must find the amount of chocolates Brenno can eat`(){
        val expected = 5
        val actual = chocolateFeast(6, 2, 2)

        assertEquals(expected, actual)
    }

    @Test
    fun`case 5 - must find the amount of chocolates Brenno can eat`(){
        val expected = 338
        val actual = chocolateFeast(25378, 75, 909)

        assertEquals(expected, actual)
    }
}