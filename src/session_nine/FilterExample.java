package session_nine;

import java.util.List;

public class FilterExample {
    static List<String> getFilteredStrings(List<String> list) {
        return list.stream()
            .filter(e -> e.startsWith("a") && e.length() == 3)
            .toList();
    }

    public static void main(String[] args) {
        List<String> list = List.of("all", "sad", "today");

        System.out.println(getFilteredStrings(list));
    }
}
