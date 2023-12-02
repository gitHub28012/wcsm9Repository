package testNGAnnotations_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 {
	
  @Test(description = "It is use to perform Login!!",enabled = true)
  public void method1() {
	  
	  Reporter.log("Method1 For Login Page", true);
  }
  
  @Test(description = "It is use to create users!!",enabled = true)
  public void method2()
  {
	  Reporter.log("Method2 For Users Page ", true);
  }
  
  @Test(description = "It is use to perform LogOut!!",enabled = false)
  public void method3()
  {
	  Reporter.log("Method3 For Logout Page ", true);
  }
  
  
}
