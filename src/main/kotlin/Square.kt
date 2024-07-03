import kotlin.math.abs
class Square(
    private val pointA: Point,
    private val pointB: Point
) : Rectangle(pointA, pointB) {
    init{
        require(abs(pointA.getXValue() - pointB.getXValue())
                == abs(pointA.getYValue() - pointB.getYValue())){
            "All sides must be the same length!\n"
        }
    }
}