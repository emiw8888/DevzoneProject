package session_five;

public class Triangle implements Shape {
    private final int side;

    private final int height;

    public Triangle(int side, int height) {
        this.side = side;
        this.height = height;
    }

    public int getSide() {
        return side;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public int calculatePerimeter() {
        return side * 3;
    }

    @Override
    public int calculateArea() {
        return side * height / 2;
    }
}
