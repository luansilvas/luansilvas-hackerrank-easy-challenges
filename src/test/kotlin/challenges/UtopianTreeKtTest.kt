package challenges

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class UtopianTreeKtTest{

    @Test
    fun `case 0 - must calculate the tree height for 5 cycles successfully`(){

        val expected = 14
        val result = utopianTree(5)

        assertEquals(expected,result)
    }

    @Test
    fun `case 1 - must calculate the tree height for 5 cycles successfully`(){

        val expected = 1
        val result = utopianTree(0)

        assertEquals(expected,result)
    }

    @Test
    fun `case 2 - must calculate the tree height for 5 cycles successfully`(){

        val expected = 2
        val result = utopianTree(1)

        assertEquals(expected,result)
    }

    @Test
    fun `case 3 - must calculate the tree height for 5 cycles successfully`(){

        val expected = 7
        val result = utopianTree(4)

        assertEquals(expected,result)
    }
}