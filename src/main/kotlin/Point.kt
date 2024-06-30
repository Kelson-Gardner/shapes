class Point(
    private var xValue: Double,
    private var yValue: Double
    ) {

    fun getXValue(): Double{
        return xValue
    }

    fun setXValue(newXValue: Double){
        xValue = newXValue
    }

    fun getYValue(): Double{
        return yValue
    }

    fun setYValue(newYValue: Double){
        yValue = newYValue
    }
    fun getValues(): Array<Double>{
        return arrayOf(xValue, yValue)
    }

    fun clonePoint(): Point{
        return Point(xValue, yValue)
    }

    fun move(deltaX: Double, deltaY: Double){
        xValue += deltaX
        yValue += deltaY
    }
}