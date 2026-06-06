package excelautomation;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOp {

	static FileInputStream fins;
	static XSSFWorkbook wb;
	static XSSFSheet sheet;
//	static XSSFRow row;
//	static XSSFCell cell;

	static File fs;

	public static void getExcelCellData(String fname, String sheetName) {
		String currentPath = System.getProperty("user.dir");
		
		try {
			fs = new File(currentPath + "\\Testdata\\" + fname + ".xlsx");
			fins = new FileInputStream(fs);
			wb = new XSSFWorkbook(fins);
			sheet = wb.getSheet(sheetName);
					
			Iterator<Row> rowItr = sheet.iterator();
			while(rowItr.hasNext())
			{
				Row row = rowItr.next();
				Iterator<Cell> cellItr = row.iterator();
				while(cellItr.hasNext())
				{
					Cell cell = cellItr.next();
					switch (cell.getCellType()) {
					case NUMERIC:
						System.out.println(cell.getNumericCellValue());
						break;
					case STRING:
						System.out.println(cell.getStringCellValue());
						break;
					case BOOLEAN:
						System.out.println(cell.getBooleanCellValue());
					case FORMULA:
						System.out.println(cell.getCellFormula());
						break;
					case BLANK:
						break;
					case ERROR:
						break;
					case _NONE:
						break;
					default:
						break;
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static void main(String[] args) {
		
		getExcelCellData("Data", "Sheet1");
	}

}
