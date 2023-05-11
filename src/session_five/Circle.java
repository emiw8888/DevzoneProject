package session_five;

public class Circle implements Shape{
    private final static double pi = Math.PI;

    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public int calculatePerimeter() {
        return (int) (2 * pi * radius);
    }

    @Override
    public int calculateArea() {
        return (int) (pi * radius * radius);
    }
}
