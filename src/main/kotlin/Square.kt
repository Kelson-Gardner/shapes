import kotlin.math.abs
class Square(
    private val pointA: Point,
    private val pointB: Point
) : Rectangle(pointA, pointB) {
    init{
        require(!pointA.getValues().contentEquals(pointB.getValues())){
            "The point values for the rectangle cannot be the same!"
        }
        require(abs(pointA.getXValue() - pointB.getXValue())
                == abs(pointA.getYValue() - pointB.getYValue())){
            "All sides must be the same length!"
        }
    }
}