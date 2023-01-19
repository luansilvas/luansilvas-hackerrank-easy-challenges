package challenges

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class AngryProfessorKtTest{

    @Test
    fun `case 0 - teacher must not cancel class successfully`(){
        val expected = "NO"
        val result = angryProfessor(3, arrayOf(-2,-1,0,1,2))

        assertEquals(expected,result)
    }

    @Test
    fun `case 1 - teacher must cancel class successfully`(){
        val expected = "YES"
        val result = angryProfessor(3, arrayOf(-1,-3,4,2))

        assertEquals(expected,result)
    }

    @Test
    fun `case 2 - teacher must NOT cancel class successfully`(){
        val expected = "NO"
        val result = angryProfessor(2, arrayOf(0,-1,2,1))

        assertEquals(expected,result)
    }


}