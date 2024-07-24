import kotlin.math.sqrt

class Line(
    private val pointA: Point,
    private val pointB: Point
) {
    init{
        require(!pointA.getValues().contentEquals(pointB.getValues())){
            "The point values for the line cannot be the same!\n"
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
        pointA.move(deltaX, deltaY)
        pointB.move(deltaX, deltaY)
    }

    private fun square(number: Double): Double{
        return number * number
    }
}