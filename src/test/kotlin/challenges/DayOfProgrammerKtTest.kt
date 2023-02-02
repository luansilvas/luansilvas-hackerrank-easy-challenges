package challenges

import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class DayOfProgrammerKtTest{
    @Test
    fun `case 0 - must find the day of the programmer successfully`(){
        val expected = "13.09.2017"
        val result = dayOfProgrammer(2017)

        assertEquals(expected, result)
    }

    @Test
    fun `case 1 - must find the day of the programmer successfully`(){
        val expected = "12.09.2016"
        val result = dayOfProgrammer(2016)

        assertEquals(expected, result)
    }

    @Test
    fun `case 2 - must find the day of the programmer successfully`(){
        val expected = "12.09.1800"
        val result = dayOfProgrammer(1800)

        assertEquals(expected, result)
    }

    @Test
    fun `case 52 - must find the day of the programmer successfully`(){
        val expected = "13.09.2100"
        val result = dayOfProgrammer(2100)

        assertEquals(expected, result)
    }

    @Test
    fun `case 51 - must find the day of the programmer successfully`(){
        val expected = "12.09.2000"
        val result = dayOfProgrammer(2000)

        assertEquals(expected, result)
    }
}