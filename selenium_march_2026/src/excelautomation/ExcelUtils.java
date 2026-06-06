package excelautomation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static File fs;
	static FileInputStream fins;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static XSSFRow row;
	static FileOutputStream fout;

	public ExcelUtils(String filepath, String sheetName)  {
		try {
			fs = new File(filepath);
			fins = new FileInputStream(fs);
			workbook = new XSSFWorkbook(fins);
			sheet = workbook.getSheet(sheetName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static int rowCount() {
		return sheet.getLastRowNum();
	}

	public static int colCount(int row) {
		return sheet.getRow(row).getLastCellNum();
	}

	// string cell value cell

	public static String getStringCellData(int row, int col) {
		return sheet.getRow(row).getCell(col).getStringCellValue();
	}

	public static double getNumericCellData(int row, int col) {
		return sheet.getRow(row).getCell(col).getNumericCellValue();
	}

	public static String getCellData(int row, int col) {
		return sheet.getRow(row).getCell(col).toString();
	}
	
	
	public static String[][] getCellData() {
		int rows = rowCount();
		int cols = colCount(0);
		System.out.println(rows+"  "+cols);

		String[][] data = new String[rows][cols];

		for (int r = 0; r <rows; r++) {
			for (int c = 0; c < cols; c++) {
				data[r][c] = sheet.getRow(r).getCell(c).toString();
			}
		}
		return data;
	}

	public static void setCellData(int row, int col, String value) {
		sheet.getRow(row).getCell(col).setCellValue(value);
		try {
			fout = new FileOutputStream(fs);
			workbook.write(fout);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				workbook.close();
				fout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void setCellDataToNewExcel(String filepath, String name, int rowIndex, int colIndex, String value) {

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet(name);
		XSSFRow row = sheet.createRow(rowIndex);
		XSSFCell cell = row.createCell(colIndex);

		cell.setCellValue(value);

		try {

			fout = new FileOutputStream(filepath);
			workbook.write(fout);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				workbook.close();
				fout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	
	public static void main(String[] args) 
	{
		
		String path =System.getProperty("user.dir")+"\\Testdata\\data.xlsx";
		new ExcelUtils(path,"Sheet1");
		
//		System.out.println(rowCount());
//		System.out.println(colCount(0));
		
		String[][] data =getCellData();
		
		for(int i=0; i<data.length; i++)
		{
			for(int j=0; j<data[0].length;j++)
			{
				System.out.print(data[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	
	
	
}
