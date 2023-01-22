package challenges

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test


class BeautifulDaysAtTheMoviesKtTest{

    @Test
    fun `must calculate the number of beautiful days successfully`(){

        val expected = 2

        val result = beautifulDays(20,23,6)

        assertEquals(expected, result)
    }
}