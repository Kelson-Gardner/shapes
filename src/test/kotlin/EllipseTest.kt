import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
class EllipseTest {
    private val testCenterPoint1 = Point(3.0, -4.0)
    private val testRadiiA1 = 4.0
    private val testRadiiB1 = 1.0
    private val testEllipse1 = Ellipse(testCenterPoint1, testRadiiA1, testRadiiB1)

    private val testCenterPoint2 = Point(-1293898.2343, 12323.0989989)
    private val testRadiiA2 = 9098990.389388949
    private val testRadiiB2 = 1098.33321
    private val testEllipse2 = Ellipse(testCenterPoint2, testRadiiA2, testRadiiB2)

    @Test
    fun testGetters(){
        assertEquals(testEllipse1.getCenterPoint(), testCenterPoint1)
        assertEquals(testEllipse1.getRadiusX(), testRadiiA1)
        assertEquals(testEllipse1.getRadiusY(), testRadiiB1)
        assertEquals(testEllipse2.getCenterPoint(), testCenterPoint2)
        assertEquals(testEllipse2.getRadiusX(), testRadiiA2)
        assertEquals(testEllipse2.getRadiusY(), testRadiiB2)
    }
    @Test
    fun testGetArea(){
        assertEquals(testEllipse1.getArea(), 12.566370614359172)
        assertEquals(testEllipse2.getArea(), 31396207770.83368)
    }
    @Test
    fun testMove(){
        testEllipse1.move(-2.0, 13.0)
        assertEquals(testEllipse1.getCenterPoint().getXValue(), 1.0)
        assertEquals(testEllipse1.getCenterPoint().getYValue(), 9.0)

        testEllipse2.move(12343982.3423, -12323.0989989)
        assertEquals(testEllipse2.getCenterPoint().getXValue(), 11050084.108)
        assertEquals(testEllipse2.getCenterPoint().getYValue(), 0.0)
    }
    @Test
    fun testInvalidEllipseFails(){
        val centerPoint = Point(0.0, 0.0)
        assertFailsWith<IllegalArgumentException> {
            Ellipse(centerPoint, 0.0, 1.0)
        }
        assertFailsWith<IllegalArgumentException> {
            Ellipse(centerPoint, 1.0, 0.0)
        }
        assertFailsWith<IllegalArgumentException> {
            Ellipse(centerPoint, 0.0, 0.0)
        }
    }
}