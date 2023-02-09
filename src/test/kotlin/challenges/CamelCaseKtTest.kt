package challenges

import org.junit.Test
import org.junit.jupiter.api.Assertions.assertEquals

class CamelCaseKtTest {

    @Test
    fun `should find the number of words successfully`() {
        val expected = 5
        val result = camelcase("saveChangesInTheEditor")

        assertEquals(expected, result)
    }
}