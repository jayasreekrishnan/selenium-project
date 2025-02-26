package Datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class readdata {

	public static void main(String[] args) throws IOException  {
		
		 // Path to the .xls file
		String path = "C:\\Users\\pbala\\Downloads\\Seleniumprojects\\testngtask\\src\\main\\java\\testdata\\data.xls";
		
		// Create a File object for the Excel file.
		File file = new File(path);
		
		// Read the file as input stream.
		FileInputStream inputdata = new FileInputStream(file);
		
		// Load the .xls workbook.
		HSSFWorkbook Workbook = new HSSFWorkbook(inputdata);
		
		// Access the "Sheet1" from the workbook.
		HSSFSheet sheets = Workbook.getSheet("Sheet1");
		
		// Get the second row (index starts at 0).
		HSSFRow row = sheets.getRow(1);
		
		// Get the first cell of the selected row.
		HSSFCell cell = row.getCell(1);
		// Fetch the cell value as a string.
		String celldata = cell.getStringCellValue();
		
		System.out.println(" Value is: " +celldata);
	}

}
