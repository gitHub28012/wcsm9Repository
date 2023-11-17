package readExcelDataNew;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadMultipleDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		        
		        for(int i=1; i<=10; i++) {
		        
		        // To provide the File Path
				FileInputStream fis = new FileInputStream("./src/main/resources/TestData.xlsx");

				// Make the File Ready To Read
				Workbook wb = WorkbookFactory.create(fis);
				
				// Read Methods
				Sheet sheet = wb.getSheet("IPL");
				Row row = sheet.getRow(i);
				Cell cell = row.getCell(0);
				String data = cell.getStringCellValue();
				System.out.println(data);

		   }
	}

}
