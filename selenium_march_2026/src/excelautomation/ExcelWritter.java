package excelautomation;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWritter {

	
	
	public static void main(String[] args) throws IOException {
		
		String currentWorkingDictory = System.getProperty("user.dir");
		
		File fs = new File(currentWorkingDictory+"\\Testdata\\data.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("appdata");
		XSSFRow row1 = sheet.createRow(0);		
			row1.createCell(0).setCellValue("Automation Testing");
			row1.createCell(1).setCellValue("core langugae");
			row1.createCell(2).setCellValue("course fee");
			
		XSSFRow row2 = sheet.createRow(1);		
			row2.createCell(0).setCellValue("Selenium with java");
			row2.createCell(1).setCellValue("Java");
			row2.createCell(2).setCellValue(5000);
			
		XSSFRow row3 = sheet.createRow(2);		
			row3.createCell(0).setCellValue("Selenium with python");
			row3.createCell(1).setCellValue("Python");
			row3.createCell(2).setCellValue(6000);
			
		FileOutputStream fout = new FileOutputStream(fs);
		workbook.write(fout);
		
		workbook.close();
		fout.close();
		
		System.out.println("File is created and data written successfully...");
		

		
	}
}
