package session_eight.repository;

import session_eight.entity.User;
import session_eight.exception.UserNotFoundException;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class UserRepository {
    private static Map<Integer, User> userMap = new HashMap<>();

    static {
        User user = new User("emil", "emil8", "Emil2003");
        userMap.put(user.getId(), user);
    }

    public static Map<Integer, User> getUserMap() {
        return userMap;
    }

    public boolean isLoginPresent(String login) {
        return userMap.keySet().stream().anyMatch(e ->
            userMap.get(e).getLogin().equals(login)
        );
    }

    public String addUser(User user) {
        if (isLoginPresent(user.getLogin())) {
            return "this login is already exist";
        }
        userMap.put(user.getId(), user);
        return "you registered successfully";
    }

    public Optional<User> getUserByLoginIfExist(String login) {
        Integer userId = userMap.keySet().stream().filter(e ->
            userMap.get(e).getLogin().equals(login)
        ).findAny().orElseThrow(() ->
            {
                throw new UserNotFoundException("USER_NOT_FOUND with login: " + login);
            }
        );
        return Optional.of(userMap.get(userId));
    }
}
