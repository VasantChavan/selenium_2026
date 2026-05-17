package excelautomation;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWritter {

	
	
	public static void main(String[] args) throws IOException {
		
		String currentWorkingDictory = System.getProperty("user.dir");
		
		FileOutputStream fout = new FileOutputStream(currentWorkingDictory+"\\Testdata\\sample.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
//		XSSFSheet sheet = workbook.getSheet("Sheet2");
//		
//		sheet.getRow(0).createCell(4).setCellValue("Location");
//		sheet.getRow(1).createCell(4).setCellValue("Pune");
//		sheet.getRow(2).createCell(4).setCellValue("Bumbai");
//		sheet.getRow(3).createCell(4).setCellValue("Nagpur");
//		
//		workbook.write(fout);
		
		
		XSSFSheet sheet = workbook.createSheet("data");
		XSSFRow row = sheet.createRow(0);
		XSSFCell cell = row.createCell(0);
		cell.setCellValue("Firstname");
		
		
		
		
		workbook.close();
		fout.close();
		
		System.out.println(" write operation is done");
		
	}
}
