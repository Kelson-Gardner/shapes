import kotlin.math.sqrt

class Line(
    private var pointA: Point,
    private var pointB: Point
) {
    init{
        require(!pointA.getValues().contentEquals(pointB.getValues())){
            "The point values for the line cannot be the same!"
        }
    }

    fun getPointA(): Point{
        return pointA
    }

    fun getPointB(): Point{
        return pointB
    }

    fun getSlope(): Double{
        val yDelta = pointA.getYValue() - pointB.getYValue()
        val xDelta = pointA.getXValue() - pointB.getXValue()
        return yDelta / xDelta
    }

    fun getLength(): Double{
        val xDifference = pointA.getXValue() - pointB.getXValue()
        val yDifference = pointA.getYValue() - pointB.getYValue()
        val sum = square(yDifference) + square(xDifference)
        return sqrt(sum)
    }

    fun move(deltaX: Double, deltaY: Double){
        pointA.setXValue(pointA.getXValue() + deltaX)
        pointA.setYValue(pointA.getYValue() + deltaY)
        pointB.setXValue(pointB.getXValue() + deltaX)
        pointB.setYValue(pointB.getYValue() + deltaY)
    }

    private fun square(number: Double): Double{
        return number * number
    }
}