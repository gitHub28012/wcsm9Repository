package testNGAnnotations_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag5 {
	
  @Test()
  public void loginMethod() {
	  
	  Reporter.log("Method1 For Login Page",true);
  }
  
  @Test()
  public void createUsersMethod() {
	  Reporter.log("Method2 For Users Page ",true);
  }
  
  @Test()
  public void logoutMethod() {
	  Reporter.log("Method3 For Logout Page ", true);
  }
}
