public class Triangle {
    //static variable
    static int numOfSides = 3;

    //attributes
    double base;
    double height;
    double sideLenOne;
    double sideLenTwo;
    double sideLenThree;

    //constructor
    public Triangle(double base, double height,
                    double sideLenOne, double sideLenTwo,
                    double sideLenThree) {
        this.base = base;
        this.height = height;
        this.sideLenOne = sideLenOne;
        this.sideLenTwo = sideLenTwo;
        this.sideLenThree = sideLenThree;
    }

    //method
    public double findArea() {
        return (this.base * this.height)/2;
    }
}
