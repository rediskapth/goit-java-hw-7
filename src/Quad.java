public class Quad extends Shape {
    public double side;

    public Quad(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public String getName() {
        return "Quad";
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}
