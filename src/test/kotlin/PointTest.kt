import kotlin.test.Test
import kotlin.test.assertEquals

class PointTest {
    @Test
    fun testGetters(){
        val point = Point(1.0, 1.0)
        assertEquals(point.getXValue(), 1.0)
        assertEquals(point.getYValue(), 1.0)
        for(value in point.getValues()){
            assertEquals(value, 1.0)
        }
    }
    @Test
    fun testSetters(){
        val point = Point(1.0, 1.0)
        point.setXValue(8.0)
        point.setYValue(-21.0)
        assertEquals(point.getXValue(), 8.0)
        assertEquals(point.getYValue(), -21.0)
        point.setXValue(-312930982.9839109)
        point.setYValue(10920934.29831)
        assertEquals(point.getXValue(), -312930982.9839109)
        assertEquals(point.getYValue(), 10920934.29831)
    }
    @Test
    fun testPointConstruction(){
        val point = Point(1.0, 1.0)
        assertEquals(point.getXValue(), 1.0)
        assertEquals(point.getYValue(), 1.0)
    }
    @Test
    fun testClonePoint(){
        val point = Point(1.0, 1.0)
        val clonedPoint = point.clonePoint()
        assertEquals(point.getXValue(), clonedPoint.getXValue())
        assertEquals(point.getYValue(), clonedPoint.getYValue())
    }
    @Test
    fun testMove(){
        val point = Point(1.0, 1.0)
        point.move(5.0, 5.0)
        assertEquals(point.getXValue(), 6.0)
        assertEquals(point.getYValue(), 6.0)
        point.move(-10.0, 4.0)
        assertEquals(point.getXValue(), -4.0)
        assertEquals(point.getYValue(), 10.0)
    }
}