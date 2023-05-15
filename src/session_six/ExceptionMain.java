package session_six;

public class ExceptionMain {
    public static void main(String[] args) {
        //checked exception
        ExceptionMain exceptionMain = new ExceptionMain();
        try {
            Object clone = exceptionMain.clone();
            System.out.println(clone);
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //unchecked exception
        int[] arr = {1,2,3,4};

        try {
            System.out.println(arr[6]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
