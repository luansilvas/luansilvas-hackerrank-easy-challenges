package challenges

import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class DivisibleSumPairKtTest{
    @Test
    fun `should find the number of summing divisible pair successfully`() {

        val expected = 5
        val result = divisibleSumPairs(6,3, arrayOf(1,3,2,6,1,2))

        assertEquals(expected, result)
    }
}