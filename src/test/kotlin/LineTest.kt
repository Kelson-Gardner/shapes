import kotlin.test.Test
import kotlin.test.assertEquals

class LineTest {
    @Test
    fun testGetters(){
        val pointA = Point(1.0, 1.0)
        val pointB = Point(2.0, 2.0)
        val line = Line(pointA, pointB)
        assertEquals(line.getPointA(), pointA)
        assertEquals(line.getPointB(), pointB)
        val pointsArray = arrayOf(pointA, pointB)
    }
    @Test
    fun testGetSlope(){
        val test1pointA = Point(0.0, 1.0)
        val test1pointB = Point(1.0, 5.0)
        val testLine1 = Line(test1pointA, test1pointB)
        assertEquals(testLine1.getSlope(), 4.0)
        val test2PointA = Point(4.0, 1.0)
        val test2PointB = Point(11.0, -5.0)
        val testLine2 = Line(test2PointA, test2PointB)
        assertEquals(testLine2.getSlope(), -0.8571428571428571)
    }
    @Test
    fun testGetLength(){
        val pointA = Point(6.0, 7.0)
        val pointB = Point(3.0, 3.0)
        val line = Line(pointA, pointB)
        assertEquals(line.getLength(), 5.0)
    }
    @Test
    fun testMove(){
        val pointA = Point(6.0, 7.0)
        val pointB = Point(3.0, 3.0)
        val line = Line(pointA, pointB)
        line.move(-6.0, -7.0)
        assertEquals(line.getPointA().getXValue(), 0.0)
        assertEquals(line.getPointA().getYValue(), 0.0)
        assertEquals(line.getPointB().getXValue(), -3.0)
        assertEquals(line.getPointB().getYValue(), -4.0)
    }
}