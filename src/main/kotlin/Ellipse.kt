import kotlin.math.PI

class Ellipse (
    private var point: Point,
    private var radiiA: Double,
    private var radiiB: Double
) : Shape() {
    init{
        require(radiiA > 0 && radiiB > 0){
            "The radii must be greater than 0"
        }
    }

    fun getPoint(): Point{
        return point
    }

    fun getRadiiA(): Double{
        return radiiA
    }

    fun getRadiiB(): Double{
        return radiiB
    }

    override fun getArea(): Double{
        return PI * radiiA * radiiB
    }

    override fun move(deltaX: Double, deltaY: Double){
        point.setXValue(point.getXValue() + deltaX)
        point.setYValue(point.getYValue() + deltaY)
    }
}