    fun createPoint(){
        try {
            println("Enter an X-Value for your point!")
            val xValue1 = readln().toDouble()
            println("Enter an Y-Value for your point!")
            val yValue1 = readln().toDouble()
            val point = Point(xValue1, yValue1)
            println("You have successfully created a point at (${point.getXValue()}, ${point.getYValue()})!")
        }
        catch(e: Exception){
            println(e.message)
        }
    }

    fun createLine() {
        try{
        println("Enter an X-Value for your first point!")
        val xValue1 = readln().toDouble()
        println("Enter an Y-Value for your first point!")
        val yValue1 = readln().toDouble()
        println("Enter an X-Value for your second point!")
        val xValue2 = readln().toDouble()
        println("Enter an Y-Value for your second point!")
        val yValue2 = readln().toDouble()
        val point1 = Point(xValue1, yValue1)
        val point2 = Point(xValue2, yValue2)
        val line = Line(point1, point2)
        val lineLength = line.getLength()
        val lineSlope = line.getSlope()
        println("The length of your line is $lineLength and the slope is $lineSlope!")
        } catch (e: Exception) {
            print(e.message)
        }
    }

    fun createCircle(){
        try {
            println("Enter an X-Value for your point!")
            val xValue1 = readln().toDouble()
            println("Enter an Y-Value for your point!")
            val yValue1 = readln().toDouble()
            println("Enter a value for your radius!")
            val radius = readln().toDouble()
            val point = Point(xValue1, yValue1)
            val circle = Circle(point, radius)
            val area = circle.getArea()
            println("Your circle was created successfully!")
            println("The radius of your circle is $area!!")
        }
        catch(e: Exception){
            println(e.message)
        }
    }

    fun createEllipse(){
        try {
            println("Enter an X-Value for your point!")
            val xValue1 = readln().toDouble()
            println("Enter an Y-Value for your point!")
            val yValue1 = readln().toDouble()
            println("Enter a value for your X-radius!")
            val xRadius = readln().toDouble()
            println("Enter a value for your Y-radius!")
            val yRadius = readln().toDouble()
            val point = Point(xValue1, yValue1)
            val ellipse = Ellipse(point, xRadius, yRadius)
            val area = ellipse.getArea()
            println("Your ellipse was created successfully!")
            println("The radius of your circle is $area!!")
        }
        catch(e: Exception){
            println(e.message)
        }
    }

    fun createSquare(){
        try{
            println("Enter an X-Value for your top left corner point!")
            val xValue1 = readln().toDouble()
            println("Enter an Y-Value for your top left corner point!")
            val yValue1 = readln().toDouble()
            println("Enter an X-Value for your bottom right corner!")
            val xValue2 = readln().toDouble()
            println("Enter an Y-Value for your bottom right corner!")
            val yValue2 = readln().toDouble()
            val point1 = Point(xValue1, yValue1)
            val point2 = Point(xValue2, yValue2)
            val square = Square(point1, point2)
            val area = square.getArea()
            println("Your square was created successfully!")
            println("The area of your square is $area!")
        } catch (e: Exception) {
            print(e.message)
        }
    }
    fun createRectangle(){
        try{
            println("Enter an X-Value for your top left corner point!")
            val xValue1 = readln().toDouble()
            println("Enter an Y-Value for your top left corner point!")
            val yValue1 = readln().toDouble()
            println("Enter an X-Value for your bottom right corner!")
            val xValue2 = readln().toDouble()
            println("Enter an Y-Value for your bottom right corner!")
            val yValue2 = readln().toDouble()
            val point1 = Point(xValue1, yValue1)
            val point2 = Point(xValue2, yValue2)
            val rectangle = Rectangle(point1, point2)
            val area = rectangle.getArea()
            println("Your rectangle was created successfully!")
            println("The area of your rectangle is $area!")
        } catch (e: Exception) {
            print(e.message)
        }
    }

    fun createTriangle(){
        try{
            println("Enter an X-Value for your left corner point!")
            val xValue1 = readln().toDouble()
            println("Enter an Y-Value for your left corner point!")
            val yValue1 = readln().toDouble()
            println("Enter an X-Value for your top corner!")
            val xValue2 = readln().toDouble()
            println("Enter an Y-Value for your top corner!")
            val yValue2 = readln().toDouble()
            println("Enter an X-Value for your right corner!")
            val xValue3 = readln().toDouble()
            println("Enter an Y-Value for your right corner!")
            val yValue3 = readln().toDouble()
            val point1 = Point(xValue1, yValue1)
            val point2 = Point(xValue2, yValue2)
            val point3 = Point(xValue3, yValue3)
            val triangle = Triangle(point1, point2, point3)
            val area = triangle.getArea()
            println("Your triangle was created successfully!")
            println("The area of your triangle is $area!")
        } catch (e: Exception) {
            print(e.message)
        }
    }

    fun main(args: Array<String>) {

        while(true) {
            val RED = "\u001b[31m";
            val BLUE = "\u001b[34m";
            val WHITE_CYAN = "\u001b[36m";
            val RED_YELLOW = "\u001b[35m";
            val PINK = "\u001b[38;5;201m";
            val LAVENDER = "\u001b[38;5;147m";
            val AQUA = "\u001b[38;2;145;231;255m";
            val reset = "\u001b[0m"
            println(RED + "* Point" + reset)
            println(BLUE + "* Line" + reset)
            println(WHITE_CYAN + "* Circle" + reset)
            println(RED_YELLOW + "* Ellipse" + reset)
            println(PINK + "* Triangle" + reset)
            println(LAVENDER + "* Square" + reset)
            println(AQUA + "* Rectangle" + reset)
            println("What would you like to create?")
            println("Enter 'x' to exit the program!")

            val shapeToCreate = readln().lowercase()

            when (shapeToCreate) {
                "point" -> createPoint()
                "line" -> createLine()
                "circle" -> createCircle()
                "ellipse" -> createEllipse()
                "triangle" -> createTriangle()
                "square" -> createSquare()
                "rectangle" -> createRectangle()
                "x" -> break
                else -> println("Please enter in a valid option or enter 'x' to exit the program!!!")
            }
        }
    }