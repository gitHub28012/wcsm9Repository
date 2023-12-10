package testPackage;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.CustomeListener;
import genericPackage.Flib;
import pagePackage.LoginPage;
@Listeners(CustomeListener.class)

public class ValidLoginTestCase extends BaseTest{
  @Test
  public void validLoginMethod() {
	  
	  // read the data from property file 
	  Flib flib = new Flib();
	  
	  //Login Page
	  LoginPage lp = new LoginPage(driver);
	 try {
		lp.validLogin(flib.readDataFromProperty(PROP_PATH1,"Username"),flib.readDataFromProperty(PROP_PATH1,"Password"));
	} catch (IOException e) {
		e.printStackTrace();
	}
  }
}
