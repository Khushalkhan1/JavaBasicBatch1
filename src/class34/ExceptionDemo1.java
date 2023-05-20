package class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo1 {
    public static void main(String[] args) throws FileNotFoundException {
        try {

            String path= "Files/MyData.xlsx";
            FileInputStream fileInputStream = new FileInputStream(path);

        } catch (FileNotFoundException e) {
            System.out.println("File Not found check your path again");
        }
        System.out.println("It is important code");
        System.out.println("It is important code");
        System.out.println("It is important code");
        System.out.println("It is important code");
        System.out.println("It is important code");
        System.out.println("It is important code");



    }
}
