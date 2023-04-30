package session_two;

import java.util.Scanner;

public class IsAlphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char symbol = scanner.next().charAt(0);

        if (symbol >= 'a' && symbol <= 'z')
            System.out.println(symbol + " -> " + (char) (symbol - 32));
        else if (symbol >= 'A' && symbol <= 'Z')
            System.out.println(symbol + " -> " + (char) (symbol + 32));
        else System.out.println(symbol + " -> The symbol you entered is not alphabet");
    }
}
