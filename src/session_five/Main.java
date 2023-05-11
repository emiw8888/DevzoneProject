package session_five;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = List.of(new Circle(3),
            new Triangle(5, 4),
            new Square(5));
        for (Shape shape : shapes) {
            System.out.println(shape.getClass().getSimpleName() + ": " );
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());
        }
    }
}
