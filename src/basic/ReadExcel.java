package basic;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public static void main(String[] args) throws IOException {
	
	XSSFWorkbook wb =new XSSFWorkbook("src/basic/loginDemo.xlsx");
	XSSFSheet sheet = wb.getSheetAt(0);
	
	String cellValue = sheet.getRow(0).getCell(1).toString();
	System.out.println("value is = "+cellValue);

}
}
