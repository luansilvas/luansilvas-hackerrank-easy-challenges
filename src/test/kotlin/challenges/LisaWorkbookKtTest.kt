package challenges

import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class LisaWorkbookKtTest {

    @Test
    fun `case 1 - should calculate the number os special problems successfully`() {
        val expected = 4
        val actual = workbook(5,3, arrayOf(4,2,6,1,10))

        assertEquals(expected, actual)
    }

    @Test
    fun `case 0 - should calculate the number os special problems successfully`() {
        val expected = 1
        val actual = workbook(5,3, arrayOf(4,2))

        assertEquals(expected, actual)
    }
}