package testPackage;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.CustomeListener;
import genericPackage.Flib;
import pagePackage.HomePage;
import pagePackage.LoginPage;
import pagePackage.TasksPage;
import pagePackage.UsersPage;
@Listeners(CustomeListener.class)

public class DeleteAllTestCase extends BaseTest{
  @Test
  public void deleteMethod() throws IOException {
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
	  
	  tp.deleteCustomers_Projects();
	  
	  hp.click_on_Users_Module();
	  
	  //users page
	  UsersPage up = new UsersPage(driver);
	  up.deleteUsersMethod();
	  
  }
}
