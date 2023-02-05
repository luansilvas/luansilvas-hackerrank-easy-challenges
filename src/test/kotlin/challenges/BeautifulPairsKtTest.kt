package challenges

import org.junit.Test
import kotlin.test.assertEquals

class BeautifulPairsKtTest {

    @Test
    fun `case 0 -should find the maximum sized disjoint beautiful set`() {
        val expected = 4
        val result = beautifulPairs(arrayOf(1, 2, 3, 4), arrayOf(1, 2, 3, 3))

        assertEquals(expected, result)
    }

    @Test
    fun `case 1 - should find the maximum sized disjoint beautiful set`() {
        val expected = 6
        val result = beautifulPairs(arrayOf(3, 5, 7, 11, 5, 8), arrayOf(5, 7, 11, 10, 5, 8))

        assertEquals(expected, result)
    }
}