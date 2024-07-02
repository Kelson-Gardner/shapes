class Circle(
    private val center: Point,
    private val radius: Double
) : Ellipse(center, radius, radius) {
    init {
        require(radius > 0) {
            "The radius must be greater than 0!"
        }
    }
}