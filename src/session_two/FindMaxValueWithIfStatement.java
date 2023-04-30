package session_two;

import java.util.Scanner;

public class FindMaxValueWithIfStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();

        if (a > b && a > c) System.out.println("Max value is: " + a);
        else if (b>c) System.out.println("Max value is: " + b);
        else System.out.println("Max value is: " + c);
    }
}
