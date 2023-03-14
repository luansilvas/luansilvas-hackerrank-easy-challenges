package challenges

import org.junit.Test
import org.junit.jupiter.api.Assertions.assertEquals

class FunnyStringKtTest {

    @Test
    fun `case 0 - should find the String funny`() {
        val value = "acxz"
        val expected = "Funny"

        assertEquals(expected, funnyString(value))
    }

    @Test
    fun `case 0 - should find the String not funny`() {
        val value = "bcxz"
        val expected = "Not Funny"

        assertEquals(expected, funnyString(value))
    }

    @Test
    fun `example - should find the String not funny`() {
        val value = "lmnop"
        val expected = "Funny"

        assertEquals(expected, funnyString(value))
    }
}