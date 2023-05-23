package session_eight;

import session_eight.service.AuthService;

import java.util.Scanner;

public class LoginMain {
    public static void main(String[] args) {
        AuthService authService = AuthService.getInstance();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome!");
        while (true) {
            System.out.println("Login or Register?");
            String choice = scanner.next();
            if (choice.equalsIgnoreCase("login")) {
                authService.loginUI(scanner);
                break;
            } else if (choice.equalsIgnoreCase("register")) {
                authService.registerUI(scanner);
            } else {
                System.out.println("incorrect input");
                break;
            }
        }
    }
}
