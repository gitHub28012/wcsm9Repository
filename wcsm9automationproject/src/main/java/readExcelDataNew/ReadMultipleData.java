package readExcelDataNew;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// Provide The Path of excel File
				FileInputStream fis = new FileInputStream("./src/main/resources/TestData.xlsx");

				//To make the file Ready to Read
				Workbook wb = WorkbookFactory.create(fis);
				
				Sheet sheet = wb.getSheet("IPL");// To get into particular Sheet.
				int rc = sheet.getLastRowNum(); // To get the no. of rows.
				
				
				
				for(int i=1; i<=rc; i++) {
			        
			       
					Row row = sheet.getRow(i); // To get into particular row
					Cell cell = row.getCell(0); // To get into particular column
					String data = cell.getStringCellValue(); // To read specific data from a particular cell
					System.out.println(data);

		}
	}

}
	
