import kotlin.math.sqrt

class Line(
    private var pointA: Point,
    private var pointB: Point
) {

    fun getPointA(): Point{
        return pointA
    }

    fun getPointB(): Point{
        return pointB
    }

    fun getPoints(): Array<Point>{
        return arrayOf(pointA, pointB)
    }

    fun getSlope(): Double{
        val yDelta = pointA.getYValue() - pointB.getYValue()
        val xDelta = pointA.getXValue() - pointB.getXValue()
        return yDelta / xDelta
    }

    fun getLength(): Double{
        val yDelta = pointA.getYValue() - pointB.getYValue()
        val xDelta = pointA.getXValue() - pointB.getXValue()
        val sum = square(yDelta) + square(xDelta)
        return sqrt(sum)
    }

    fun moveTo(newPointA: Point, newPointB: Point){
        pointA = newPointA
        pointB = newPointB
    }

    private fun square(number: Double): Double{
        return number * number
    }
}