package challenges

import org.junit.Test
import org.junit.jupiter.api.Assertions
import kotlin.test.assertEquals

class IceCreamParlorKtTest {
    @Test
    fun `case 0 - should find the ice cream which prices match the money they have successfully`() {

        val expected = arrayOf(1, 4)
        val result = iceCreamParlor(6, arrayOf(1, 3, 4, 5, 6))

        Assertions.assertEquals(expected[0], result[0])
        Assertions.assertEquals(expected[1], result[1])
        assertEquals(expected.size, result.size)
    }

    @Test
    fun `case 1 - should find the ice cream which prices match the money they have successfully`() {

        val expected = arrayOf(1, 4)
        val result = iceCreamParlor(4, arrayOf(1, 4, 5, 3, 2))

        Assertions.assertEquals(expected[0], result[0])
        Assertions.assertEquals(expected[1], result[1])
        assertEquals(expected.size, result.size)
    }

    @Test
    fun `case 2 - should find the ice cream which prices match the money they have successfully`() {

        val expected = arrayOf(1, 2)
        val result = iceCreamParlor(4, arrayOf(2, 2, 4, 3))

        Assertions.assertEquals(expected[0], result[0])
        Assertions.assertEquals(expected[1], result[1])
        assertEquals(expected.size, result.size)
    }

}