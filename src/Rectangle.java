public class Rectangle extends Shape {
    private double side1;
    private double side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (side1 + side2);
    }

    @Override
    public String getName() {
        return "Rectangle";
    }
}
