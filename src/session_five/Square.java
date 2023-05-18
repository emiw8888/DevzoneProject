package session_five;

public class Square implements Shape {
    private final int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public int calculatePerimeter() {
        return side * 4;
    }

    @Override
    public int calculateArea() {
        return side * side;
    }
}
