package challenges

import org.junit.Test
import org.junit.jupiter.api.Assertions.assertEquals

class HurdleRaceKtTest {

    @Test
    fun `should calculate the number of potions needed to jump the hurdles successfully`() {

        val expected = 2
        val result = hurdleRace(1, arrayOf(1, 2, 3, 3, 2))

        assertEquals(expected, result)
    }

    @Test
    fun `should calculate the number of potions needed to jump the hurdles successfully with multiple heights`() {

        val expected = 2
        val result = hurdleRace(4, arrayOf(1, 6, 3, 5, 2))

        assertEquals(expected, result)
    }

    @Test
    fun `should calculate the number of potions needed to jump the hurdles successfully when he can jum them all`() {

        val expected = 0
        val result = hurdleRace(7, arrayOf(2, 5, 4, 5, 2))

        assertEquals(expected, result)
    }
}