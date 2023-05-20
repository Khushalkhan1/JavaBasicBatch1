package class34;

public class ExceptionDemo6 {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
            String s=null;
            System.out.println(s.length());
            int [] arr={20,25};
            System.out.println(arr[4]);
            System.out.println(arr[-1]);
        }catch (NullPointerException e){
            System.out.println("You can not apply any method on null object");
            }catch (ArithmeticException arithmeticException){
            System.out.println("You can not divide a number by zero");
        }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println("The array length is smaller that you try");
        }catch (Exception exception){
            System.out.println("Other type of error to handle");
        }finally {
            System.out.println("This is some other code");
            System.out.println("This is some other code");
            System.out.println("This is some other code");
            System.out.println("This is some other code");
            System.out.println("This is some other code");
        }
    }
}
