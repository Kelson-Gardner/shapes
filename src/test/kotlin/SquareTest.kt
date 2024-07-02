import kotlin.test.Test
import kotlin.test.assertEquals
class SquareTest {
    private val topLeftCornerPoint1 = Point(0.0, 10.0)
    private val bottomRightCornerPoint1 = Point(10.0, 0.0)
    private val testSquare1 = Square(topLeftCornerPoint1, bottomRightCornerPoint1)

    private val topLeftCornerPoint2 = Point(-8000000.0, -8000000.0)
    private val bottomRightCornerPoint2 = Point(8000000.0, 8000000.0)
    private val testSquare2 = Square(topLeftCornerPoint2, bottomRightCornerPoint2)

    @Test
    fun testRectangleConstruction(){
        assertEquals(testSquare1.getTopLeftCorner(), topLeftCornerPoint1)
        assertEquals(testSquare1.getBottomRightCorner(), bottomRightCornerPoint1)
        assertEquals(testSquare2.getTopLeftCorner(), topLeftCornerPoint2)
        assertEquals(testSquare2.getBottomRightCorner(), bottomRightCornerPoint2)
    }
    @Test
    fun testGetArea(){
        assertEquals(testSquare1.getArea(), 100.0)
        assertEquals(testSquare2.getArea(), 256000000000000.0)
    }
    @Test
    fun testMove(){
        testSquare1.move(-13.0, 4.0)
        assertEquals(testSquare1.getTopLeftCorner().getXValue(), -13.0)
        assertEquals(testSquare1.getTopLeftCorner().getYValue(), 14.0)
        assertEquals(testSquare1.getBottomRightCorner().getXValue(), -3.0)
        assertEquals(testSquare1.getBottomRightCorner().getYValue(), 4.0)

        testSquare2.move(-12343.23222, 98984.0032)
        assertEquals(testSquare2.getTopLeftCorner().getXValue(), -8012343.23222)
        assertEquals(testSquare2.getTopLeftCorner().getYValue(), -7901015.9968)
        assertEquals(testSquare2.getBottomRightCorner().getXValue(), 7987656.76778)
        assertEquals(testSquare2.getBottomRightCorner().getYValue(), 8098984.0032)
    }
}