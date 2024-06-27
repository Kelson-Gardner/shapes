class Point(
    private var xValue: Double,
    private var yValue: Double
    ) {

    fun getXValue(): Double{
        return xValue
    }

    fun getYValue(): Double{
        return yValue
    }

    // DO I NEED THIS FUNCTION????
    fun getValues(): Array<Double>{
        return arrayOf(xValue, yValue)
    }

    fun clonePoint(): Point{
        return Point(xValue, yValue)
    }

    fun moveTo(newXValue: Double, newYValue: Double){
        xValue = newXValue
        yValue = newYValue
    }
}