package sessionOne;

import java.util.*;

public class SessionOne {
    public static void main(String[] args) {
        int number = 30;
        double valueDouble = number;
        int valueInt = 20;
        String valueString = "Learning session";
        System.out.println("valueDouble: " + valueDouble);
        valueDouble = 23.63;
        System.out.println("number: " + number);
        System.out.println("valueInt: " + valueInt);
        System.out.println("valueString: " + valueString);
        System.out.println("valueDouble: " + valueDouble);


        //last task
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        Integer intValue = scanner.nextInt();
        System.out.print("Enter a double value: ");
        Double doubleValue = scanner.nextDouble();
        System.out.print("Enter a character value: ");
        Character charValue = scanner.next().charAt(0);
        System.out.print("Enter a string value: ");
        /*bug of scanner*/
        scanner.nextLine();
        String stringValue = scanner.nextLine();
        System.out.println("You entered the following values: ");
        System.out.println(intValue.getClass().getSimpleName() + ": " + intValue);
        System.out.println(doubleValue.getClass().getSimpleName() + ": " + doubleValue);
        System.out.println(charValue.getClass().getSimpleName() + ": " + charValue);
        System.out.println(stringValue.getClass().getSimpleName() + ": " + stringValue);

        //additional way
        List<Object> list = List.of(intValue, doubleValue, charValue, stringValue);
        list.forEach(e -> System.out.println(e.getClass().getSimpleName() + ": " + e));
    }
}
