package session_eight;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BooleanGeneric {
    public static <T> boolean isContain(Collection<T> collection, T item) {
        return collection.contains(item);
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 4, 5);

        System.out.println(isContain(list, 4));
    }
}
