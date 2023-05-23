package session_nine;

import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
    static String convertNumbersToString(List<Integer> list) {
        return list.stream().map(e -> e % 2 == 0 ? "e" + e : "o" + e
        ).collect(Collectors.joining(","));
    }

    static String convertNumbersToStringSecondVersion(List<Integer> list) {
        return list.stream()
            .map(e -> e % 2 == 0 ? "e" + e : "o" + e
            ).reduce((x, y) -> x + "," + y).get();
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(3, 44);

        System.out.println(convertNumbersToString(list));

        System.out.println(convertNumbersToStringSecondVersion(list));
    }
}
