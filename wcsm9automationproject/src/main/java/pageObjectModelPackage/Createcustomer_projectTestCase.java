package pageObjectModelPackage;

import java.io.IOException;

public class Createcustomer_projectTestCase  extends BaseTest{
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		//to open & close Browser
		BaseTest bt = new BaseTest();
		bt.setUp();
		
		//read the data from property and excel file
		Flib flib = new Flib();
		
		//to perform  VALID login use Login page pom 
		LoginPage lp = new LoginPage(driver);
		lp.validLogin(flib.readDataFromProperty(PROP_PATH,"Username"),flib.readDataFromProperty(PROP_PATH,"Password"));
		
		Thread.sleep(2000);
		
		//to work Task Module use HomePage Pom
		HomePage hp = new HomePage(driver);
		hp.click_on_Tasks_Module();
		
		Thread.sleep(2000);
		
		//to create customer and project use TasksPage pom
		TasksPage tp = new TasksPage(driver);
		tp.createcustomer_createproject_method(flib.readDataFromExcel(EXCEL_PATH, CUSTOMER_PROJECT_SHEET,1,0),flib.readDataFromExcel(EXCEL_PATH, CUSTOMER_PROJECT_SHEET,1,1));
		
		Thread.sleep(2000);
		bt.tearDown();
	}
	
	

}
