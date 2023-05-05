package session_four;

public class Main {
    public static void main(String[] args) {
        GeometricShape geometricShape = new GeometricShape(3, 4);
        System.out.println(geometricShape);
        Triangle triangle = new Triangle(3, 4);
        System.out.println(triangle);

        try {
            GeometricShape clone = (GeometricShape) geometricShape.clone();
            System.out.println(clone);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
