package class33;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelFileDemo {
    public static void main(String[] args) throws IOException {
        String path= "C:/Users/Dell/IdeaProjects/JavaBasicBatch1/Files/MyData.xlsx";
        System.out.println(path);

        FileInputStream fileInputStream =new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet=xssfWorkbook.getSheet("Sheet1");
        Row row=sheet.getRow(3);
        Cell cell=row.getCell(2);
        System.out.println(cell);
        System.out.println(cell.getNumericCellValue());//This will show numbers like 3, 2, 1 etc.
        //System.out.println(cell.getStringCellValue());//This will show the value .

    }
}
