import kotlin.test.Test
import kotlin.test.assertEquals
class RectangleTest {
    private val topLeftCornerPoint1 = Point(1.0, 5.0)
    private val bottomRightCornerPoint1 = Point(5.0, 3.0)
    private val testRectangle1 = Rectangle(topLeftCornerPoint1, bottomRightCornerPoint1)

    private val topLeftCornerPoint2 = Point(109309.34232, 981983.332321)
    private val bottomRightCornerPoint2 = Point(-12343214.2343, -23421.3344)
    private val testRectangle2 = Rectangle(topLeftCornerPoint2, bottomRightCornerPoint2)
    @Test
    fun testRectangleConstruction(){
        assertEquals(testRectangle1.getTopLeftCorner(), topLeftCornerPoint1)
        assertEquals(testRectangle1.getBottomRightCorner(), bottomRightCornerPoint1)
        assertEquals(testRectangle2.getTopLeftCorner(), topLeftCornerPoint2)
        assertEquals(testRectangle2.getBottomRightCorner(), bottomRightCornerPoint2)
    }
    @Test
    fun testGetArea(){
        assertEquals(testRectangle1.getArea(), 8.0)
        assertEquals(testRectangle2.getArea(), 12519825316387.03)
    }
    @Test
    fun testMove(){
        testRectangle1.move(-13.0, 4.0)
        assertEquals(testRectangle1.getTopLeftCorner().getXValue(), -12.0)
        assertEquals(testRectangle1.getTopLeftCorner().getYValue(), 9.0)
        assertEquals(testRectangle1.getBottomRightCorner().getXValue(), -8.0)
        assertEquals(testRectangle1.getBottomRightCorner().getYValue(), 7.0)

        testRectangle2.move(-12343.23222, 98984.0032)
        assertEquals(testRectangle2.getTopLeftCorner().getXValue(), 96966.11009999999)
        assertEquals(testRectangle2.getTopLeftCorner().getYValue(), 1080967.335521)
        assertEquals(testRectangle2.getBottomRightCorner().getXValue(), -12355557.46652)
        assertEquals(testRectangle2.getBottomRightCorner().getYValue(), 75562.66880000001)
    }
}