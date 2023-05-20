package class34;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionDemo7 {
    public static void main(String[] args) {

        System.out.println("Some Code here");
        System.out.println("Some Code here");
        System.out.println("Some Code here");
        System.out.println("Some Code here");
        System.out.println("Some Code here");

        String path="Files/MyData.xlsx";
        FileInputStream fileInputStream =null;

        try {
            fileInputStream=new FileInputStream(path);
        }catch (FileNotFoundException fileNotFoundException){
            System.out.println("The file is not found with following path "+path);
        }finally {
            try {
                fileInputStream.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }


    }
}
