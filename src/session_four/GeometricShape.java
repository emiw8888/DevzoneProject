package session_four;

public class GeometricShape implements Cloneable {
    private final int numberOfSides;
    private final double lengthOfSides;
    private double area;

    public GeometricShape(int numberOfSides, double lengthOfSides) {
        this.numberOfSides = numberOfSides;
        this.lengthOfSides = lengthOfSides;
        this.area = numberOfSides * lengthOfSides;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public double getLengthOfSides() {
        return lengthOfSides;
    }

    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "A shape with " + numberOfSides + " sides," +
            " each of length " + lengthOfSides +
            ", and area " + area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        GeometricShape geometricShape = (GeometricShape) super.clone();
        geometricShape.area = geometricShape.lengthOfSides * geometricShape.numberOfSides;
        return geometricShape;
    }
}
