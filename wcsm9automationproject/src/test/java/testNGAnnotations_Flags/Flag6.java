package testNGAnnotations_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag6 {
	
	
  @Test(groups="Functional Test Case")
  public void ft1() {
	  Reporter.log("ft1", true);
  }
  
  @Test(groups="Integration  Test Case")
  public void it1()
  {
	  Reporter.log("it1", true);
  }
  
  
  @Test(groups="Smoke Test Case")
  public void st1()
  {
	  Reporter.log("st1", true);
  }
  
 //----------------------------------------------------------------------------------

  @Test(groups="Functional Test Case")
  public void ft2() {
	  Reporter.log("ft2", true);
  }
  
  @Test(groups="Integration  Test Case")
  public void it2()
  {
	  Reporter.log("it2", true);
  }
  
  
  @Test(groups="Smoke Test Case")
  public void st2()
  {
	  Reporter.log("st2", true);
  }
  
  //---------------------------------------------------------------------------------------
  @Test(groups="Functional Test Case")
  public void ft3() {
	  Reporter.log("ft3", true);
  }
  
  @Test(groups="Integration  Test Case")
  public void it3()
  {
	  Reporter.log("it3", true);
  }
  
  
  @Test(groups="Smoke Test Case")
  public void st3()
  {
	  Reporter.log("st3", true);
  }
  
  //---------------------------------------------------------------------------------------
  @Test(groups="Functional Test Case")
  public void ft4() {
	  Reporter.log("ft4", true);
  }
  
  @Test(groups="Integration  Test Case")
  public void it4()
  {
	  Reporter.log("it4", true);
  }
  
  
  @Test(groups="Smoke Test Case")
  public void st4()
  {
	  Reporter.log("st4", true);
  }
  //----------------------------------------------------------------------------------------------
  @Test(groups="Functional Test Case")
  public void ft5() {
	  Reporter.log("ft5", true);
  }
  
  @Test(groups="Integration  Test Case")
  public void it5()
  {
	  Reporter.log("it5", true);
  }
  
  
  @Test(groups="Smoke Test Case")
  public void st5()
  {
	  Reporter.log("st5", true);
  }
  
  
//---------------------------------------------------------------------------------------
  @Test(groups="Functional Test Case")
  public void ft6() {
	  Reporter.log("ft6", true);
  }
  
  @Test(groups="Integration  Test Case")
  public void it6()
  {
	  Reporter.log("it6", true);
  }
  
  
  @Test(groups="Smoke Test Case")
  public void st6()
  {
	  Reporter.log("st6", true);
  }
  
  
  




}
