package class34;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ExcelToMapDemo {
    public static void main(String[] args) throws IOException {
        String path = "Files/MyData.xlsx";
        //System.out.println(path);
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = xssfWorkbook.getSheet("userData");
        Map<String, String> map = new HashMap<>();
        int numberOfRowInTheSheet = sheet.getPhysicalNumberOfRows();
        System.out.println(numberOfRowInTheSheet);
        for (int i = 1; i < numberOfRowInTheSheet; i++) {
            Row row = sheet.getRow(i);
            int numberOfCellInSheet = row.getPhysicalNumberOfCells();
            for (int j = 0; j < numberOfCellInSheet; j++) {
                //System.out.println(row.getCell(j));
                String key = sheet.getRow(1).getCell(j).toString();
                String value = row.getCell(j).toString();

                System.out.print(key + " " + value + " ");

                map.put(key, value);
            }
            System.out.println();
        }
        System.out.println(map);
    }
}
