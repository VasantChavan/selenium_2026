package excelautomation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWritter2 {
	
	public static void main(String[] args) throws IOException {
		
		String currentWorkingDictory = System.getProperty("user.dir");
		
		File fs = new File(currentWorkingDictory+"\\Testdata\\data.xlsx");
		
		FileInputStream fins = new FileInputStream(fs);
		XSSFWorkbook workbook = new XSSFWorkbook(fins);
		
		XSSFSheet sheet = workbook.getSheet("appdata");
		
		int rows= sheet.getLastRowNum();
		int cols = sheet.getRow(0).getLastCellNum();
		
		System.out.println("row count are : "+rows);
		System.out.println("column count are "+cols);
		
		System.out.println(sheet.getRow(0).getCell(0).toString());
		System.out.println(sheet.getRow(0).getCell(1).toString());
		System.out.println(sheet.getRow(0).getCell(2).toString());
		
		
		sheet.getRow(0).createCell(cols).setCellValue("Status");
		sheet.getRow(1).createCell(cols).setCellValue("Active-Batch");
		sheet.getRow(2).createCell(cols).setCellValue("Passive-batch");
		
		XSSFRow row3 = sheet.createRow(3);
			row3.createCell(0).setCellValue("new batches");
			row3.createCell(1).setCellValue("playwright");
			row3.createCell(2).setCellValue(6760);
			row3.createCell(3).setCellValue("playwright");
		
		FileOutputStream fout = new FileOutputStream(fs);
		workbook.write(fout);
		
		workbook.close();
		fins.close();
		fout.close();
		
		System.out.println("File is created and data written successfully...");
		

		
	}
}
