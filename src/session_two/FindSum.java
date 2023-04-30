package session_two;

import java.util.Scanner;

public class FindSum {
    public static void main(String[] args) {
        int firstElementOfFirstRow = 2;
        int lastElementOfFirstRow = 112;
        int firstElementOfSecondRow = 5;
        int lastElementOfSecondRow = 71;

        //5 is d for first row and 3 for second
        int n = ((lastElementOfFirstRow - firstElementOfFirstRow) / 5) + 1;

        System.out.println("sum of all numbers: " +
            n * (((firstElementOfFirstRow + lastElementOfFirstRow) / 2)
                + ((firstElementOfSecondRow + lastElementOfSecondRow) / 2)));
    }
}
