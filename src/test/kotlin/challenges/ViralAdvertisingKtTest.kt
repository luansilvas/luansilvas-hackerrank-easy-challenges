package challenges

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ViralAdvertisingKtTest{

    @Test
    fun `should calculate the amount of likes on the given day successfully`(){

        val expected = 24
        val result = viralAdvertising(5)

        assertEquals(expected, result)
    }
}