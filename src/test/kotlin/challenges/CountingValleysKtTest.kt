package challenges

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CountingValleysKtTest {

    @Test
    fun `case 0 - should calculate the number of valleys successfully`() {
        val expected = 1
        val result = countingValleys(8, "DDUUUUDD")

        assertEquals(expected,result)
    }
    @Test
    fun `case 1 - should calculate the number of valleys successfully`() {
        val expected = 1
        val result = countingValleys(8, "UDDDUDUU")

    assertEquals(expected,result)
    }
}