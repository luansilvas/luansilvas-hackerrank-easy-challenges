package challenges

import org.junit.Test
import kotlin.test.assertEquals

class MinimumDistancesKtTest {

    @Test
    fun `should find the minimum distance successfully`() {
        val expected = 2
        val actual = minimumDistances(arrayOf(3, 2, 1, 2, 3))

        assertEquals(expected,actual)
    }

}