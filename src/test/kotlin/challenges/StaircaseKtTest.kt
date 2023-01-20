package challenges

import org.junit.jupiter.api.Assertions.assertDoesNotThrow
import org.junit.jupiter.api.Test
import staircase

class StaircaseKtTest {

    @Test
    fun `should print staircase successfully`() {
        assertDoesNotThrow {
            staircase(6)
        }
    }
}