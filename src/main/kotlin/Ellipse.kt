import kotlin.math.PI
open class Ellipse (
    private val center: Point,
    private val radiusX: Double,
    private val radiusY: Double
) : Shape() {
    init{
        require(radiusX > 0 && radiusY > 0){
            "The radii must be greater than 0"
        }
    }

    fun getCenterPoint(): Point{
        return center
    }

    fun getRadiusX(): Double{
        return radiusX
    }

    fun getRadiusY(): Double{
        return radiusY
    }

    override fun getArea(): Double{
        return PI * radiusX * radiusY
    }

    override fun move(deltaX: Double, deltaY: Double){
        center.setXValue(center.getXValue() + deltaX)
        center.setYValue(center.getYValue() + deltaY)
    }
}