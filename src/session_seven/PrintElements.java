package session_seven;

public class PrintElements {
    public static <T> void printArray(T[] arr){
        for (T element : arr) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer[] intArr = {1,2,3};

        String[] strArr = {"Hello","World"};

        printArray(intArr);
        printArray(strArr);
    }
}
