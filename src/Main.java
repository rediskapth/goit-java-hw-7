public class Main {

    public static void main(String[] args) {
        NamePrinter namePrinter = new NamePrinter();
        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(2, 3, 1);
        Shape pentagon = new Pentagon(1, 2, 3, 4, 5);
        Quad quad = new Quad(7);
        Shape rectangle = new Rectangle(4, 6);

        namePrinter.printName(circle);
        namePrinter.printName(quad);
        namePrinter.printName(rectangle);

        System.out.println(circle.getName() + " with radius - " + circle.getRadius() +
                " has perimeter - " + circle.calculatePerimeter());
        System.out.println(triangle.getName() + " with sides - " + triangle.getSide1() + ", " +
                triangle.getSide2() + ", " +
                triangle.getSide3() + " has perimeter - " + triangle.calculatePerimeter());
        System.out.println(pentagon.getName() + " has perimeter - " + pentagon.calculatePerimeter() +
                ". But we can't print sides, because 'pentagon' created as Parent Class.");
        System.out.println(quad.getName() + " has all sides = " + quad.getSide());
    }
}
