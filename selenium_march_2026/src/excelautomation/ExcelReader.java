package excelautomation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	
	public static void main(String[] args) throws IOException {
		
		String currentWorkingDictory = System.getProperty("user.dir");
		System.out.println(currentWorkingDictory);
		
		
		//FileInputStream --> it will help you to open the any in reading mode
		
		FileInputStream fis = new FileInputStream(currentWorkingDictory+"\\Testdata\\sample.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		//XSSFSheet sheet = workbook.getSheet("Sheet2");
		
		XSSFSheet sheet = workbook.getSheetAt(1);
		
		int rows = sheet.getLastRowNum();
		short cols = sheet.getRow(0).getLastCellNum();
		
		
		System.out.println("Row count "+rows); // total number of rows -1
		System.out.println("Column count "+cols);
		
		
		// read the data from cell at 0 row and 0 column 
		
		//XSSFRow row = sheet.getRow(0);
		
//		String r0c0= row.getCell(0).getStringCellValue();
//		System.out.println(r0c0);
//		
//		System.out.println(row.getCell(1).getStringCellValue());
//		
		
//		for(int i=0; i<cols;i++)
//		{
//			System.out.print(row.getCell(i).getStringCellValue()+"\t");
//		}
		
		
		for(int r=0; r<=rows; r++)
		{
			XSSFRow row = sheet.getRow(r);
			for(int c=0; c<cols; c++)
			{
				XSSFCell cell = row.getCell(c);
				System.out.print(cell.toString()+"\t");
			}
			System.out.println();
		}
		workbook.close();
		fis.close();
		
	}

}
