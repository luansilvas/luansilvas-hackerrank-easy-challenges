package challenges

import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class StrangeCounterKtTest{

    @Test
    fun `case 0 - should find the value for a given time`(){
        val expected = 6L
        val actual = strangeCounter(4)

        assertEquals(expected, actual)
    }

    @Test
    fun `case 1 - should find the value for a given time`(){
        val expected = 5L
        val actual = strangeCounter(17)

        assertEquals(expected, actual)
    }
}