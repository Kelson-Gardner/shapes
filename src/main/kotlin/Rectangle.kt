import kotlin.math.abs

open class Rectangle(
    private var topLeftCornerPoint: Point,
    private var bottomRightCornerPoint: Point
) : Shape {

    init{
        require(!topLeftCornerPoint.getValues().contentEquals(bottomRightCornerPoint.getValues())){
            "The point values for the rectangle cannot be the same!\n"
        }
    }

    fun getTopLeftCorner(): Point{
        return topLeftCornerPoint
    }

    fun getBottomRightCorner(): Point{
        return bottomRightCornerPoint
    }

    override fun getArea(): Double{
        val height = getHeight()
        val width = getWidth()
        return height * width
    }

    override fun move(deltaX: Double, deltaY: Double){
        topLeftCornerPoint.setXValue(topLeftCornerPoint.getXValue() + deltaX)
        topLeftCornerPoint.setYValue(topLeftCornerPoint.getYValue() + deltaY)
        bottomRightCornerPoint.setXValue(bottomRightCornerPoint.getXValue() + deltaX)
        bottomRightCornerPoint.setYValue(bottomRightCornerPoint.getYValue() + deltaY)
    }

    private fun getWidth(): Double{
        return abs(topLeftCornerPoint.getXValue() - bottomRightCornerPoint.getXValue())
    }


    private fun getHeight(): Double{
        return abs(topLeftCornerPoint.getYValue() - bottomRightCornerPoint.getYValue())
    }
}