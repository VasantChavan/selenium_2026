package excelautomation;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWritter3 {

	
	
	public static void main(String[] args) throws IOException {
		
		String currentWorkingDictory = System.getProperty("user.dir");
		
		File fs = new File(currentWorkingDictory+"\\Testdata\\myfile.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Data");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many rows you want ");
		int rows =sc.nextInt();
		
		System.out.println("Enter how many cols you want ");
		int cols =sc.nextInt();
		
		for(int r=0; r<=rows; r++)
		{
			XSSFRow row = sheet.createRow(r);
			for(int c=0;c<cols;c++)
			{
				XSSFCell cell = row.createCell(c);
				cell.setCellValue(sc.next());
			}
		}
			
		FileOutputStream fout = new FileOutputStream(fs);
		workbook.write(fout);
		
		sc.close();
		workbook.close();
		fout.close();
		
		System.out.println("File is created and data written successfully...");
		

		
	}
}
