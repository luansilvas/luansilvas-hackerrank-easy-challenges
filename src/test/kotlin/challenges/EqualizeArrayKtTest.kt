package challenges

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class EqualizeArrayKtTest{

    @Test
    fun `should calculate the minimum exclusions to equalize array`(){

        val expected = 2

        assertEquals(equalizeArray(arrayOf(3,3,2,1,3)),expected)
        assertEquals(equalizeArray(arrayOf(1,2,2,3)),expected)
    }

}