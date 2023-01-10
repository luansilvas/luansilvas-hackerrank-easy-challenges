package challenges

import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class RepeatedStringKtTest{
    @Test
    fun `Must find the number of as successfully with short entry`() {
        val expected = 7L
        val result = repeatedString("aba",10)
        assertEquals(expected, result)
    }

    @Test
    fun `Must find the number of as successfully with a multiple-letter entry`() {
        val expected = 4L
        val result = repeatedString("abcac",10)
        assertEquals(expected, result)
    }

    @Test
    fun `Must find the number of as successfully with only a as input`() {
        val expected = 1000000000000L
        val result = repeatedString("a",1000000000000)
        assertEquals(expected, result)
    }



}

