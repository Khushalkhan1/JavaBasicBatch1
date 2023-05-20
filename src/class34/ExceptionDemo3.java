package class34;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        String s = null;
       /* try {
            System.out.println(s.length());
        }catch (NullPointerException e) {
            System.out.println(e);
        }*/
        if (s==null){
            System.out.println("We can not run any method on null value");
        }else {
            System.out.println(s.length());
        }
    }
}
