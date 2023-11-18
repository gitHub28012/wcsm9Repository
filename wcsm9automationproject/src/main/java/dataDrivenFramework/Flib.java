package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	public String readExcelData(String excelPath, String sheetName, int rowNo, int cellNo) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		String data = cell.getStringCellValue();
		return data;
	}
	
	public void writeExcelData(String excelPath, String sheetName, int rowNo, int cellNo, String data) throws EncryptedDocumentException, IOException {
		 
		FileInputStream fis = new FileInputStream(excelPath); // Provide the Path of Excel File
		Workbook wb = WorkbookFactory.create(fis); // Make the File Ready to Read
		Sheet sheet = wb.getSheet(sheetName); // Get into the Sheet
		Row row = sheet.getRow(rowNo);       // Get into the desired Row
		Cell cell = row.createCell(cellNo);  // Create the desired Cell
		cell.setCellValue(data);            // Enter the data in the created cell
		
		FileOutputStream fos = new FileOutputStream(excelPath); // Provide the path of excel file
		wb.write(fos);                                         // Write the data in the Excel File
	}
	
	public int rowCount(String excelPath, String sheetName) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream(excelPath); // Provide the Path of Excel File
		Workbook wb = WorkbookFactory.create(fis);           // Make the File Ready to Read
		Sheet sheet = wb.getSheet(sheetName);               // Get into the Sheet
		int rc = sheet.getLastRowNum();                    // Get the no. of rows present in the sheet 
		return rc;
	}
}
