package session_four;

public class Triangle extends GeometricShape {
    private double height;

    public Triangle(double height, double lengthOfSides) {
        super(3, lengthOfSides);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public double getArea() {
        return (super.getLengthOfSides() * this.getHeight()) / 2;
    }

    @Override
    public String toString() {
        return "A triangle with " + getNumberOfSides() + " sides," +
            " each of length " + getLengthOfSides() +
            ", height " + height +
            ", and area " + getArea();
    }
}
