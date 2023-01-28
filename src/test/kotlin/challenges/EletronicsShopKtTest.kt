package challenges

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class EletronicsShopKtTest{

    @Test
    fun `case 0 - should get the best budget`(){

        val expected = 58
        val result = getMoneySpent(arrayOf(30,50,60), arrayOf(5,8,12),60)

        assertEquals(expected, result)
    }

    @Test
    fun `case 1 - should get the best budget`(){

        val expected = 9
        val result = getMoneySpent(arrayOf(3,1), arrayOf(5,2,8),10)

        assertEquals(expected, result)
    }
}