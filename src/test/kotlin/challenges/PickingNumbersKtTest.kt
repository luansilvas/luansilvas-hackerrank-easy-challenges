package challenges

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class PickingNumbersKtTest {

    @Test
    fun `case 0 - should calculate the subarray with the smallest difference successfully`() {
        val expected = 3
        val result = pickingNumbers(arrayOf(4, 6, 5, 3, 3, 1))

        assertEquals(expected,result)

    }

    @Test
    fun `case 1 - should calculate the subarray with the smallest difference successfully`() {
        val expected = 5
        val result = pickingNumbers(arrayOf(1, 2, 2, 3, 1, 2))

        assertEquals(expected,result)

    }

    @Test
    fun `case 2 - should calculate the subarray with the smallest difference successfully`() {
        val expected = 2
        val result = pickingNumbers(arrayOf(98, 3, 99, 1, 97, 2))

        assertEquals(expected,result)
    }

    @Test
    fun `case 4 - should calculate the subarray with the smallest difference successfully`() {
        val expected = 3
        val result = pickingNumbers(    arrayOf(84,  43,  11,  41,  2,  99,  31,  32,  56,  53,  42,  14,  98,  27,  64,  57,  16,  33,  48,  21,  46,  61,  87,  90,  28,  12,  62,  49,  29,  77,  82,  70,  80,  89,  95,  52,  13,  19,  9,  79,  35,  67,  51,  39,  7,  1,  66,  8,  17,  85,  71,  97,  34,  73,  75,  6,  91,  40,  96,  65,  37,  74,  20,  68,  23,  47,  76,  55,  24,  3,  30,  22,  55,  5,  69,  86,  54,  50,  10,  59,  15,  4,  36,  38,  83,  60,  72,  63,  78,  58,  88,  93,  45,  18,  94,  44,  92,  81,  25,  26)
        )

        assertEquals(expected,result)
    }

    @Test
    fun `case 5 - should calculate the subarray with the smallest difference successfully`() {
        val expected = 30
        val result = pickingNumbers(arrayOf(7,  12,  13,  19,  17,  7,  3,  18,  9,  18,  13,  12,  3,  13,  7,  9,  18,  9,  18,  9,  13,  18,  13,  13,  18,  18,  17,  17,  13,  3,  12,  13,  19,  17,  19,  12,  18,  13,  7,  3,  3,  12,  7,  13,  7,  3,  17,  9,  13,  13,  13,  12,  18,  18,  9,  7,  19,  17,  13,  18,  19,  9,  18,  18,  18,  19,  17,  7,  12,  3,  13,  19,  12,  3,  9,  17,  13,  19,  12,  18,  13,  18,  18,  18,  17,  13,  3,  18,  19,  7,  12,  9,  18,  3,  13,  13,  9,  7)
        )

        assertEquals(expected,result)
    }


}