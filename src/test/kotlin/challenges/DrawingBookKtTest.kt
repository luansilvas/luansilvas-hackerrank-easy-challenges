package challenges

import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class DrawingBookKtTest{

    @Test
    fun `case 0 - must count the number of turned pages successfully `(){

        assertEquals(1, pageCount(6,2))
    }

    @Test
    fun `case 1 - must count the number of turned pages successfully `(){

        assertEquals(0, pageCount(5,4))
    }

    @Test
    fun `case 26 - must count the number of turned pages successfully `(){

        assertEquals(1, pageCount(6,5))
    }
}