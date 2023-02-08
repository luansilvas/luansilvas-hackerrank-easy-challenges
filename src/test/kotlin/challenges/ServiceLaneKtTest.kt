package challenges

import org.junit.Test
import kotlin.test.assertTrue

class ServiceLaneKtTest {

    @Test
    fun `should calculate the maximum width vehicle that can pass through each segment`() {
        val expected = arrayOf(1, 2, 3, 2, 1)
        val actual = serviceLane(
            8, arrayOf(
                arrayOf(0, 3),
                arrayOf(4, 6),
                arrayOf(6, 7),
                arrayOf(3, 5),
                arrayOf(0, 7),

                ),
            arrayOf(2, 3, 1, 2, 3, 2, 3, 3)
        )

        expected.forEach {
            assertTrue(actual.contains(it))
        }
    }
}