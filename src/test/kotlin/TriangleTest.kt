import kotlin.test.Test
import kotlin.test.assertEquals

class TriangleTest {
    private val equilateralPointA = Point(2.0, 1.0)
    private val equilateralPointB = Point(4.5, 5.33)
    private val equilateralPointC = Point(7.0, 1.0)
    private val equilateralTriangle = Triangle(equilateralPointA, equilateralPointB, equilateralPointC)

    private val isoscelesPointA = Point(0.0, 0.0)
    private val isoscelesPointB = Point(5.0, 0.0)
    private val isoscelesPointC = Point(2.5, 7.0)
    private val isoscelesTriangle = Triangle(isoscelesPointA, isoscelesPointB, isoscelesPointC)

    private val scalenePointA = Point(-1423.2321, -1298.222)
    private val scalenePointB = Point(128111.22, 12.847)
    private val scalenePointC = Point(1344.211, 87981.2334)
    private val scaleneTriangle = Triangle(scalenePointA, scalenePointB, scalenePointC)

    @Test
    fun testGetters(){
        assertEquals(equilateralTriangle.getPointA(), equilateralPointA)
        assertEquals(equilateralTriangle.getPointB(), equilateralPointB)
        assertEquals(equilateralTriangle.getPointC(), equilateralPointC)

        assertEquals(isoscelesTriangle.getPointA(), isoscelesPointA)
        assertEquals(isoscelesTriangle.getPointB(), isoscelesPointB)
        assertEquals(isoscelesTriangle.getPointC(), isoscelesPointC)

        assertEquals(scaleneTriangle.getPointA(), scalenePointA)
        assertEquals(scaleneTriangle.getPointB(), scalenePointB)
        assertEquals(scaleneTriangle.getPointC(), scalenePointC)
    }
    @Test
    fun testGetArea(){
        assertEquals(equilateralTriangle.getArea(), 10.825000000000001)
        assertEquals(isoscelesTriangle.getArea(), 17.5)
        assertEquals(scaleneTriangle.getArea(), 5780568515.083856)
    }
    @Test
    fun testMove(){
        equilateralTriangle.move(3.0, -4.0)
        assertEquals(equilateralTriangle.getPointA().getXValue(), 5.0)
        assertEquals(equilateralTriangle.getPointA().getYValue(), -3.0)
        assertEquals(equilateralTriangle.getPointB().getXValue(), 7.5)
        assertEquals(equilateralTriangle.getPointB().getYValue(), 1.33)
        assertEquals(equilateralTriangle.getPointC().getXValue(), 10.0)
        assertEquals(equilateralTriangle.getPointC().getYValue(), -3.0)

        isoscelesTriangle.move(-8.0, 2.0)
        assertEquals(isoscelesTriangle.getPointA().getXValue(), -8.0)
        assertEquals(isoscelesTriangle.getPointA().getYValue(), 2.0)
        assertEquals(isoscelesTriangle.getPointB().getXValue(), -3.0)
        assertEquals(isoscelesTriangle.getPointB().getYValue(), 2.0)
        assertEquals(isoscelesTriangle.getPointC().getXValue(), -5.5)
        assertEquals(isoscelesTriangle.getPointC().getYValue(), 9.0)

        scaleneTriangle.move(-2387.212, 33422.01)
        assertEquals(scaleneTriangle.getPointA().getXValue(), -3810.4440999999997)
        assertEquals(scaleneTriangle.getPointA().getYValue(), 32123.788)
        assertEquals(scaleneTriangle.getPointB().getXValue(), 125724.008)
        assertEquals(scaleneTriangle.getPointB().getYValue(), 33434.857)
        assertEquals(scaleneTriangle.getPointC().getXValue(), -1043.001)
        assertEquals(scaleneTriangle.getPointC().getYValue(), 121403.2434)
    }
}