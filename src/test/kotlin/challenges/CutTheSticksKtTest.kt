package challenges

import org.junit.Test
import org.junit.jupiter.api.Assertions.assertTrue

class CutTheSticksKtTest {

    @Test
    fun `case 0 - must cut the sticks successfully`() {
        val expected = arrayOf(6, 4, 2, 1)
        val result = cutTheSticks(arrayOf(5, 4, 4, 2, 2, 8))

        assertTrue(expected.all { it in result })
        assertTrue(result.all { it in expected })
    }

    @Test
    fun `case 1 - must cut the sticks successfully`() {
        val expected = arrayOf(8, 6, 4, 1)
        val result = cutTheSticks(arrayOf(1, 2, 3, 4, 3, 3, 2, 1))

        assertTrue(expected.all { it in result })
        assertTrue(result.all { it in expected })
    }

}