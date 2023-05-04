package session_three;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int range = scanner.nextInt();

        int firstNum = 0;
        int secondNum = 1;
        int sum;

        while (range-- > 0){
            System.out.print(firstNum + " ");
            sum = secondNum + firstNum;
            firstNum = secondNum;
            secondNum = sum;
        }
    }
}
