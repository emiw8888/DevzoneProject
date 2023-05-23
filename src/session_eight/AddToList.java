package session_eight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddToList {
    static List<String> listOfStrings = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        while(true){
            System.out.println("Input string(input stop if you want to finish): ");
            String string = scanner.next();

            if (string.equals("stop")){
                break;
            }

            list.add(string);
        }

        addToList(list);
        System.out.println(listOfStrings);
    }

    static void addToList(List<String> strings){
        listOfStrings.addAll(strings);
    }
}
