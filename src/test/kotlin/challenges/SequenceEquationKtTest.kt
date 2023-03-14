package challenges

import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class SequenceEquationKtTest{

    @Test
    fun `example - should find the values of  for all  in the arithmetic sequence`(){
        val expected = arrayOf(4,2,5,1,3)
        val input = arrayOf(5,2,1,3,4)

        assertTrue(
            input.toList().containsAll(expected.toList())
        )

    }

    @Test
    fun `case 0 - should find the values of  for all  in the arithmetic sequence`(){
        val expected = arrayOf(2,3,1)
        val input = arrayOf(2,3,1)

        assertTrue(
            input.toList().containsAll(expected.toList())
        )

    }
}