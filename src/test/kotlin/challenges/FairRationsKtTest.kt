package challenges

import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class FairRationsKtTest{
    @Test
    fun `should calculate the distribution successfully`(){

        val expected = 4
        val actual = fairRations(arrayOf(2, 3, 4, 5 , 6))

        assertEquals(expected, actual)
    }
}