package Datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writedata {
	
	    public void writeExcel(String sheetName, String cellvalue, int row, int col) throws Exception {
		  
		  String excelPath="C:\\Users\\pbala\\Downloads\\Seleniumprojects\\testngtask\\src\\main\\java\\testdata\\data.xls";
		  
		  File file= new File(excelPath);
		  
		  FileInputStream fis= new FileInputStream(file);
		  
		  XSSFWorkbook wb= new XSSFWorkbook(fis);
		  
		  XSSFSheet sheet= wb.getSheet(sheetName);
		  
		  sheet.getRow(row).createCell(col).setCellValue(cellvalue);
		  
		  FileOutputStream fos= new FileOutputStream(new File(excelPath));
		  
		  wb.write(fos);
		  
		  //wb.close();
		  
		  fos.close();
		 
	    }

}
