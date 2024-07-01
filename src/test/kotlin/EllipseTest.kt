import kotlin.test.Test
import kotlin.test.assertEquals

class EllipseTest {
    private val testPoint1 = Point(3.0, -4.0)
    private val testRadiiA1 = 4.0
    private val testRadiiB1 = 1.0
    private val testEllipse1 = Ellipse(testPoint1, testRadiiA1, testRadiiB1)

    private val testPoint2 = Point(-1293898.2343, 12323.0989989)
    private val testRadiiA2 = 9098990.3893889489
    private val testRadiiB2 = 1098.33321
    private val testEllipse2 = Ellipse(testPoint2, testRadiiA2, testRadiiB2)

    @Test
    fun testGetters(){
        assertEquals(testEllipse1.getPoint(), testPoint1)
        assertEquals(testEllipse1.getRadiiA(), testRadiiA1)
        assertEquals(testEllipse1.getRadiiB(), testRadiiB1)
        assertEquals(testEllipse2.getPoint(), testPoint2)
        assertEquals(testEllipse2.getRadiiA(), testRadiiA2)
        assertEquals(testEllipse2.getRadiiB(), testRadiiB2)
    }
    @Test
    fun testGetArea(){
        assertEquals(testEllipse1.getArea(), 12.566370614359172)
        assertEquals(testEllipse2.getArea(), 31396207770.83368)
    }
    @Test
    fun testMove(){
        testEllipse1.move(-2.0, 13.0)
        assertEquals(testEllipse1.getPoint().getXValue(), 1.0)
        assertEquals(testEllipse1.getPoint().getYValue(), 9.0)

        testEllipse2.move(12343982.3423, -12323.0989989)
        assertEquals(testEllipse2.getPoint().getXValue(), 11050084.108)
        assertEquals(testEllipse2.getPoint().getYValue(), 0.0)
    }
}