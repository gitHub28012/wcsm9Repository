package testPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.CustomeListener;
import genericPackage.Flib;
import pagePackage.HomePage;
import pagePackage.LoginPage;
import pagePackage.UsersPage;
@Listeners(CustomeListener.class)

public class CreateNewUsersTestCase extends BaseTest {
  @Test
  public void createValidNewUsersMethod() throws IOException, EncryptedDocumentException, InterruptedException {
	  
	  // read the data from property file 
	  Flib flib = new Flib();
	  
	  //Login Page
	  LoginPage lp = new LoginPage(driver);
	  lp.validLogin(flib.readDataFromProperty(PROP_PATH1,"Username"),flib.readDataFromProperty(PROP_PATH1,"Password"));
	
	  //Home Page
	  HomePage hp = new HomePage(driver);
	  hp.click_on_Users_Module();
	  
	  Thread.sleep(2000);
	  //Users Page
	  UsersPage up = new UsersPage(driver);
	
	  up.usersLoginCredsMethod(flib.readDataFromExcel(EXCEL_PATH,USERS_SHEET,1,0),flib.readDataFromExcel(EXCEL_PATH,USERS_SHEET,1,1));
	 // Thread.sleep(2000);
	  up.usersContact_AccessMethod(flib.readDataFromExcel(EXCEL_PATH,USERS_SHEET,1,2),flib.readDataFromExcel(EXCEL_PATH,USERS_SHEET,1,3));
  }
}
