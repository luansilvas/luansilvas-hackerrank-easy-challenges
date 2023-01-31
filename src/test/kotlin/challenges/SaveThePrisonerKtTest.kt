package challenges

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SaveThePrisonerKtTest {

    @Test
    fun `case 0 - should find the prisoner that gets the last candy successfully`() {

        val expected = 2
        val result = saveThePrisoner(5,2,1)

        assertEquals(expected, result)
    }

    @Test
    fun `case 1 - should find the prisoner that gets the last candy successfully`() {

        val expected = 3
        val result = saveThePrisoner(5,2,2)

        assertEquals(expected, result)
    }

    @Test
    fun `case 2 - should find the prisoner that gets the last candy successfully`() {

        val expected = 6
        val result = saveThePrisoner(7,19,2)

        assertEquals(expected, result)
    }

    @Test
    fun `case 3 - should find the prisoner that gets the last candy successfully`() {

        val expected = 3
        val result = saveThePrisoner(3, 7, 3)

        assertEquals(expected, result)
    }
}