import kotlin.math.abs

class Triangle(
    private var pointA: Point,
    private var pointB: Point,
    private var pointC: Point
) : Shape{

    init{
        require(!pointA.getValues().contentEquals(pointB.getValues())
                || !pointA.getValues().contentEquals(pointC.getValues())
                || !pointB.getValues().contentEquals(pointC.getValues())){
            "None of the triangle points can be the same!\n"
        }
        require(pointA.getXValue() != pointB.getXValue()
                || pointA.getXValue() != pointC.getXValue()
                || pointB.getXValue() != pointC.getXValue()){
            "The triangles points cannot all be on the same line on the X-axis!\n"
        }
        require(pointA.getYValue() != pointB.getYValue()
                || pointA.getYValue() != pointC.getYValue()
                || pointB.getYValue() != pointC.getYValue()){
            "The triangles points cannot all be on the same line on the Y-axis!\n"
        }
    }

    fun getPointA(): Point{
        return pointA
    }

    fun getPointB(): Point{
        return pointB
    }

    fun getPointC(): Point{
        return pointC
    }

    override fun getArea(): Double{
        val yDifferenceBC = pointB.getYValue() - pointC.getYValue()
        val yDifferenceCA = pointC.getYValue() - pointA.getYValue()
        val yDifferenceAB = pointA.getYValue() - pointB.getYValue()
        return .5 * abs(pointA.getXValue() * yDifferenceBC + pointB.getXValue() * yDifferenceCA + pointC.getXValue() * yDifferenceAB)
        }

    override fun move(deltaX: Double, deltaY: Double){
        pointA.setXValue(pointA.getXValue() + deltaX)
        pointA.setYValue(pointA.getYValue() + deltaY)
        pointB.setXValue(pointB.getXValue() + deltaX)
        pointB.setYValue(pointB.getYValue() + deltaY)
        pointC.setXValue(pointC.getXValue() + deltaX)
        pointC.setYValue(pointC.getYValue() + deltaY)
    }
}