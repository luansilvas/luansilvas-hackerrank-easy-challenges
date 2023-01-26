package challenges

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SockMerchantKtTest{

    @Test
    fun `must calculate the number of pairs successfully`(){
        val expected = 3
        val result = sockMerchant(arrayOf(10, 20, 20, 10, 10, 30, 50, 10, 20))

        assertEquals(expected, result)
    }
}