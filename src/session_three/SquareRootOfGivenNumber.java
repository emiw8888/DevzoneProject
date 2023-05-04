package session_three;

import java.util.Scanner;

public class SquareRootOfGivenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        for (int i = 1; i < number; i++) {
            System.out.print(i * i + " ");
        }
    }
}
