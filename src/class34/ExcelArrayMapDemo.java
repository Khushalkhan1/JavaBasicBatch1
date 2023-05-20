package class34;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ExcelArrayMapDemo {
    public static void main(String[] args) throws IOException {
        String path="Files/MyData.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet=xssfWorkbook.getSheet("Sheet1");
        int numberOfRow=sheet.getPhysicalNumberOfRows();
        ArrayList<Map<String, String>> arrayList=new ArrayList<>();
        for (int i=1; i<numberOfRow; i++){
            HashMap<String, String> map=new HashMap<>();
            Row row=sheet.getRow(i);
            String firstName=row.getCell(0).toString();
            String lastName=row.getCell(1).toString();
            String age=row.getCell(2).toString();
            map.put("firstName", firstName);
            map.put("lastName", lastName);
            map.put("age",age);

            arrayList.add(map);
            System.out.println(firstName + " " + lastName + " " + map);


        }
        System.out.println(arrayList);
    }
}
