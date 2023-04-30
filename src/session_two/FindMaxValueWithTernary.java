package session_two;

import java.util.Scanner;

public class FindMaxValueWithTernary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        short a = scanner.nextShort();
        short b = scanner.nextShort();
        short c = scanner.nextShort();

        System.out.println(a > b && a > c ? a : b > c ? b : c);
    }
}
