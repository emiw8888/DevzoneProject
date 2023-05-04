package session_three;

public class FindMinMax {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 5}, {10, 23, 4}, {56, 22, 43}};

        int min = arr[0][0];
        int max = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (min > arr[i][j]) min = arr[i][j];
                else if (max < arr[i][j]) max = arr[i][j];
            }
        }
        System.out.println("min: " + min + " max: " + max);
    }
}
