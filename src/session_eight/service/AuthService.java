package session_eight.service;

import session_eight.entity.User;
import session_eight.exception.IncorrectPasswordException;
import session_eight.exception.UserNotFoundException;
import session_eight.repository.UserRepository;

import java.util.Optional;
import java.util.Scanner;

public class AuthService {
    private static final AuthService INSTANCE = new AuthService();
    private final UserRepository userRepository = new UserRepository();
    private int passwordCounter = 0;

    public static AuthService getInstance() {
        return INSTANCE;
    }

    private AuthService() {

    }

    public void loginUI(Scanner scanner) {
        while (true) {
            System.out.println("Login: ");
            String login = scanner.next();
            System.out.println("Password: ");
            String password = scanner.next();
            //String password = System.console().readPassword() bu kod en idealidi password ucun ama IDE de problem verir diye yazanmadim :(
            try {
                User user = login(login, password);
                System.out.println(user);
                break;
            } catch (IncorrectPasswordException e) {
                if (passwordCounter == 3) {
                    System.out.println("you lost all your attempts");
                }
                System.out.println("Incorrect password try again");
            } catch (UserNotFoundException userNotFoundException) {
                System.out.println("no such user with this login");
            }
        }
    }

    public void registerUI(Scanner scanner) {
        while (true) {
            System.out.println("Enter your name: ");
            String name = scanner.next();
            System.out.println("Enter login: ");
            String login = scanner.next();
            if (userRepository.isLoginPresent(login)) {
                System.out.println("this login already registered. Do you want change or exit?");
                String choice = scanner.next();
                if (choice.equalsIgnoreCase("change")) {
                    continue;
                } else if (choice.equalsIgnoreCase("exit")) {
                    return;
                } else {
                    System.out.println("incorrect input");
                    return;
                }
            }
            System.out.println("Enter your password: ");
            String password = scanner.next();
            System.out.println(userRepository.addUser(new User(name, login, password)));
            System.out.println(UserRepository.getUserMap());
            break;
        }
    }

    private User login(String login, String password) {
        Optional<User> user = userRepository.getUserByLoginIfExist(login);
        if (user.get().getPassword() == password.hashCode()) {
            return user.get();
        } else {
            passwordCounter++;
            throw new IncorrectPasswordException();
        }
    }

}
