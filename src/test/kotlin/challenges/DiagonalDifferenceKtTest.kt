package challenges

import org.junit.Test
import org.junit.jupiter.api.Assertions.assertEquals

class DiagonalDifferenceKtTest {

    @Test
    fun `Must calculate difference between matrix diagonals successfully`() {

        val matrix = arrayOf(
            arrayOf(1, 2, 3),
            arrayOf(4, 5, 6),
            arrayOf(9, 8, 9)
        )
        val expected = 2
        val result = diagonalDifference(matrix)

        assertEquals(expected, result)
    }


    @Test
    fun `Must calculate difference between matrix diagonals successfully when it contains negative elements`() {

        val matrix = arrayOf(
            arrayOf(11, 2, 4),
            arrayOf(4, 5, 6),
            arrayOf(10, 8, -12)
        )
        val expected = 15
        val result = diagonalDifference(matrix)

        assertEquals(expected, result)
    }
}