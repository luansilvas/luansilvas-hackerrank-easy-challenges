package challenges

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MigratoryBirdsKtTest{

    @Test
    fun `should find the id of the most sighted bird with the smallest id successfully`(){
        val expected = 3
        val result = migratoryBirds(arrayOf(1,4,4,4,5,3,3,3))


        assertEquals(expected,result)
    }
}