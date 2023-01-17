package challenges

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LibraryFineKtTest {

    @Test
    fun `case 1 - should calculate library daily fee successfully`(){

        val expected = 45
        val result = libraryFine(9,6,2015,6,6,2015)

        assertEquals(expected, result)
    }

    @Test
    fun `case 2 - should calculate library monthly fee successfully`(){

        val expected = 500
        val result = libraryFine(6,7,2015,6,6,2015)

        assertEquals(expected, result)
    }

    @Test
    fun `case 3 - should calculate library daily fee successfully`(){

        val expected = 135
        val result = libraryFine(14,7,2018,5,7,2018)

        assertEquals(expected, result)
    }

    @Test
    fun `case 3 - should calculate library annual fee successfully`(){

        val expected = 10000
        val result = libraryFine(1,1,2018,31,12,2017)

        assertEquals(expected, result)
    }

    @Test
    fun `case 4 - should calculate library fee successfully when returning date is before`(){

        val expected = 0
        val result = libraryFine(2,6,2014,1,1,2015)

        assertEquals(expected, result)
    }

    @Test
    fun `case 5 - should calculate library fee successfully when returning date is before`(){

        val expected = 0
        val result = libraryFine(28,2,2015,15,4,2015)

        assertEquals(expected, result)
    }




}