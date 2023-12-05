package testNGAssertations;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NewTestAssert {
  @Test
  public void assertMethod() {
	  
	  Reporter.log("Launch Browsers!!",true);
	  Reporter.log("Launch WebAppliocation by using url",true);
	  
	 
	  Reporter.log("Verify and validate the loginPage",true);
	  //Apply SoftAssert
	  SoftAssert sa = new SoftAssert();
	  sa.assertEquals(true,false);  // soft assert
	  Reporter.log("Login Performed!!",true);
	  
	  Reporter.log("Verify and validate the homePage",true);
	  //Apply HardAssert
	  Assert.assertEquals(true,true);   // hard assert
	  Reporter.log("User Created!!",true);
	  Reporter.log("Task Created!!",true);
	  
	  sa.assertAll();
	  
	  
	  
  }
}
