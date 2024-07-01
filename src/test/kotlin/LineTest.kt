import kotlin.test.Test
import kotlin.test.assertEquals

class LineTest {
    private val testPointA1 = Point(0.0, 1.0)
    private val testPointB1 = Point(1.0, 5.0)
    private val testLine1 = Line(testPointA1, testPointB1)

    private val test2PointA = Point(4.0, 1.0)
    private val test2PointB = Point(11.0, -5.0)
    private val testLine2 = Line(test2PointA, test2PointB)
    @Test
    fun testGetters(){
        assertEquals(testLine1.getPointA(), testPointA1)
        assertEquals(testLine1.getPointB(), testPointB1)
    }
    @Test
    fun testGetSlope(){
        assertEquals(testLine1.getSlope(), 4.0)
        assertEquals(testLine2.getSlope(), -0.8571428571428571)
    }
    @Test
    fun testGetLength(){
        assertEquals(testLine1.getLength(), 4.123105625617661)
        assertEquals(testLine2.getLength(), 9.219544457292887)
    }
    @Test
    fun testMove(){
        testLine1.move(-6.0, -7.0)
        assertEquals(testLine1.getPointA().getXValue(), -6.0)
        assertEquals(testLine1.getPointA().getYValue(), -6.0)
        assertEquals(testLine1.getPointB().getXValue(), -5.0)
        assertEquals(testLine1.getPointB().getYValue(), -2.0)

        testLine2.move(3.0, 1.0)
        assertEquals(testLine2.getPointA().getXValue(), 7.0)
        assertEquals(testLine2.getPointA().getYValue(), 2.0)
        assertEquals(testLine2.getPointB().getXValue(), 14.0)
        assertEquals(testLine2.getPointB().getYValue(), -4.0)
    }
}