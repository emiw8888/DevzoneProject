package session_six;

import java.util.Map;
import java.util.Scanner;

public class QueueService {
    private static final Map<String,User> users = Map.of("emil8",new User("emil","cahangirli",18),
        "svetlana7",new User("Svetlana","Cumayeva",20)
    );

    public static User getUserByUsername(String username){
        if (!users.containsKey(username)){
            throw new NotFoundException("USER_NOT_FOUND by username: " + username);
        }
        return users.get(username);
    }

    public static void main(String[] args) {
        try{
            User user = QueueService.getUserByUsername("emil9");
            System.out.println(user);

        } catch (NotFoundException exception){
            System.out.println(exception);
        }
    }
}
