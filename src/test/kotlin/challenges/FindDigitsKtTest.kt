package challenges

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class FindDigitsKtTest{

    @ParameterizedTest
    @ValueSource(ints = [124,111])
    fun `Must found divisors successfully when all digits are divisible`(value: Int) {

        val expected = 3
        val result = findDigits(value)

        assertEquals(expected, result)
    }

    @ParameterizedTest
    @ValueSource(ints = [1012])
    fun `Must found divisors successfully when it contains non divisible numbers`() {

        val expected = 3
        val result = findDigits(1012)

        assertEquals(expected, result)
    }
}