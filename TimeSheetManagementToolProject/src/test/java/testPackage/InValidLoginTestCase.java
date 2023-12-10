package testPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.CustomeListener;
import genericPackage.Flib;
import pagePackage.LoginPage;
@Listeners(CustomeListener.class)

public class InValidLoginTestCase extends BaseTest {
  @Test
  public void invalidLoginMethod() throws EncryptedDocumentException, IOException {
	  
	  // read the data from property file 
	  Flib flib = new Flib();
	  
	  //Login Page
	  LoginPage lp = new LoginPage(driver);
	  
	  int rc = flib.rowCount(EXCEL_PATH, INVALIDCREEDS_SHEET);
	  
	  for(int i=1;i<=rc;i++)
	  {
		  lp.invalidLogin(flib.readDataFromExcel(EXCEL_PATH, INVALIDCREEDS_SHEET, i, 0),flib.readDataFromExcel(EXCEL_PATH, INVALIDCREEDS_SHEET, i,1));
	  }
  }
}
