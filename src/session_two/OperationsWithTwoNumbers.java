package session_two;

import java.util.Scanner;

public class OperationsWithTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        char operator = scanner.next().charAt(0);
        int secondNumber = scanner.nextInt();

        switch (operator) {
            case '+' ->
                System.out.printf("%d + %d = %d", firstNumber, secondNumber, firstNumber + secondNumber);
            case '-' ->
                System.out.printf("%d - %d = %d", firstNumber, secondNumber, firstNumber - secondNumber);
            case '*' ->
                System.out.printf("%d * %d = %d", firstNumber, secondNumber, firstNumber * secondNumber);
            case '/' -> {
                if (secondNumber == 0) {
                     System.out.println("You cannot divide by zero");
                    break;
                }
                System.out.printf("%d / %d = %f", firstNumber, secondNumber, (float) firstNumber / secondNumber);
            }
            default -> System.out.println("No such operator");
        }

    }
}
