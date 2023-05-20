package class34;

public class ExceptionDemo4 {
    public static void main(String[] args) {
        int[] arr = {10, 20};
        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("arr is out of bound");
        }
    }
}
