package testPackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.Flib;
import pagePackage.HomePage;
import pagePackage.LoginPage;
import pagePackage.TasksPage;

public class CeateNewCustomers_ProjectsTestCase extends BaseTest {
  @Test
  public void createNewCustomers_Projects() throws IOException, EncryptedDocumentException, InterruptedException {
	  
	  // read the data from property file 
	  Flib flib = new Flib();
	  
	  //Login Page
	  LoginPage lp = new LoginPage(driver);
	  lp.validLogin(flib.readDataFromProperty(PROP_PATH1,"Username"),flib.readDataFromProperty(PROP_PATH1,"Password"));
	
	  //Home Page
	  HomePage hp = new HomePage(driver);
	  hp.click_on_Tasks_Module();
	  
	  //Tasks Page
	  TasksPage tp = new TasksPage(driver);
	  tp.createcustomer_createproject_method(flib.readDataFromExcel(EXCEL_PATH, CUSTOMER_PROJECT_SHEET,1, 0),flib.readDataFromExcel(EXCEL_PATH, CUSTOMER_PROJECT_SHEET,1,1));
	  
  }
}
