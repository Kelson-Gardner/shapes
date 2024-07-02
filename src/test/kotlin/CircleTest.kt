import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
class CircleTest {
    private val testCenterPoint1 = Point(5.0, 5.0)
    private val testCircle1 = Circle(testCenterPoint1, 5.0)

    private val testCenterPoint2 = Point(-2983721.2343, 283982128.3332)
    private val testCircle2 = Circle(testCenterPoint2, 98781783.002)

    @Test
    fun testGetters(){
        assertEquals(testCircle1.getCenterPoint(), testCenterPoint1)
        assertEquals(testCircle2.getCenterPoint(), testCenterPoint2)
    }
    @Test
    fun testGetArea(){
        assertEquals(testCircle1.getArea(), 78.53981633974483)
        assertEquals(testCircle2.getArea(), 30655160510534956.0)
    }
    @Test
    fun testMove(){
        testCircle1.move(-7.0, 11.0)
        assertEquals(testCircle1.getCenterPoint().getXValue(), -2.0)
        assertEquals(testCircle1.getCenterPoint().getYValue(), 16.0)
        testCircle2.move(11232129.232, -28386749283.22198)
        assertEquals(testCircle2.getCenterPoint().getXValue(), 8248407.9977)
        assertEquals(testCircle2.getCenterPoint().getYValue(), -2.8102767154888783E10)
    }
    @Test
    fun testInvalidCircleFails(){
        val centerPoint = Point(0.0, 0.0)
        assertFailsWith<IllegalArgumentException> {
            Circle(centerPoint, 0.0)
        }
    }
}