package readExcelData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcelData {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("./src/main/resources/TestData.xlsx");
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sheet = wb.getSheet("IPL");
        
        //create new Row into Excel sheet
       // Row row = sheet.createRow(11);
        Row row = sheet.getRow(0);
        
        //create new Cell
        Cell cell = row.createCell(2);
        
        //set the string value to cell
        cell.setCellValue("Location");
        
        //store the value into sheet
        FileOutputStream fos = new FileOutputStream("./src/main/resources/TestData.xlsx");
	
	   //write the data 
        wb.write(fos);
        
	}

}
