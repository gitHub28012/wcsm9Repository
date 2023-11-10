package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//Read the data from TestData.xlsx file
		FileInputStream fis = new FileInputStream("./src/main/resources/TestData.xlsx");
	    Workbook wb = WorkbookFactory.create(fis);
	    Sheet sheet = wb.getSheet("IPL");
	    Row row = sheet.getRow(1);
	    Cell cell = row.getCell(1);
	    
	    String data = cell.getStringCellValue();
	    
	    System.out.println(data);
	}

}
