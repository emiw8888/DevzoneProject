package session_five;

public class Iphone implements Phone {


    @Override
    public void takePicture() {
        System.out.println("Iphone is taking picture");
    }

    @Override
    public void printColor() {
        System.out.println("Iphone color");
    }
}
