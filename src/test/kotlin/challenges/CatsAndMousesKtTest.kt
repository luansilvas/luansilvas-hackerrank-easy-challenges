package challenges

import org.junit.Test
import org.junit.jupiter.api.Assertions.assertEquals

class CatsAndMousesKtTest{
    @Test
    fun `Distance between both cats and Rats must be the same`() {

        val expected = "Mouse C"
        val result = catAndMouse(1,3,2)

        assertEquals(expected, result)
    }

    @Test
    fun `Cat B must catch the mouse first`() {

        val expected = "Cat B"
        val result = catAndMouse(1,2,3)

        assertEquals(expected, result)
    }

    @Test
    fun `Cat A must catch  the mouse first`() {

        val expected = "Cat A"
        val result = catAndMouse(2,1,3)

        assertEquals(expected, result)
    }

}