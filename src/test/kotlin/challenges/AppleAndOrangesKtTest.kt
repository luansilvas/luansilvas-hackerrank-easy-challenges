package challenges

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class AppleAndOrangesKtTest{

    @Test
    fun `case 0 - should calculate the amount of apple and oranges that land on Sams house`(){

        val expected = arrayOf(1,2)
        val result = countApplesAndOranges(7,10,4,12, arrayOf(2,3,-4), arrayOf(3,-2,-4))

        assertEquals(result[0], expected[0])
        assertEquals(result[1], expected[1])
    }

    @Test
    fun `case 1 - should calculate the amount of apple and oranges that land on Sams house`(){

        val expected = arrayOf(1,1)
        val result = countApplesAndOranges(7,11,5,15, arrayOf(-2,2,1), arrayOf(5,-6))

        assertEquals(result[0], expected[0])
        assertEquals(result[1], expected[1])
    }

}