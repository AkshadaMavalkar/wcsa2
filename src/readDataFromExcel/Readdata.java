package readDataFromExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readdata {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
		
		//make file ready fo read operation
		Workbook wb = WorkbookFactory.create(fis);
		
		//go to specified sheet
		Sheet sh = wb.getSheet("TestData");
		
		//go to the specified row
		Row row = sh.getRow(1);
		
		//go to specified column
		Cell cell = row.getCell(1);
		
		//get the data from the cell
		String data = cell.getStringCellValue();
		
		//print the data
		System.out.println(data);
	}

}