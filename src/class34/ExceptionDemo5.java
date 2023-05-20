package class34;

public class ExceptionDemo5 {
    public static void main(String[] args) {
        try {
            System.out.println(10/10);
            String s=null;
            System.out.println(s.length());
            int [] arr={20,25};
            System.out.println(arr[4]);
            System.out.println(arr[-1]);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
