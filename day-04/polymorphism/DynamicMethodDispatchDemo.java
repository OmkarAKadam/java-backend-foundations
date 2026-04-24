public class DynamicMethodDispatchDemo {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(5),
            new Rectangle(4, 6),
            new Triangle(3, 4),
            new Square(4)
        };

        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.area());
        }
    }
}