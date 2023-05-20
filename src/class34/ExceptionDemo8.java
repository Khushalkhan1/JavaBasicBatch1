package class34;

public class ExceptionDemo8 {
    public static void main(String[] args) {
        int num=10;
        int num2=2;

        if (num2==0){
            throw new ArithmeticException("Can not be divided by zero");
        }else {
            System.out.println(num2/num);
        }
    }
}
