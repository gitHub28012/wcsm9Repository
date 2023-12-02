package testNGAnnotations_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4 {
	
	
  @Test (priority = 3)
  public void f() {
	  
	  Reporter.log("f",true);
  }
  
  @Test(priority = 3)
  public void p()
  {
	  Reporter.log("p",true);
  }
  
  @Test(priority = 0)
  public void s()
  {
	  Reporter.log("s",true);
  }
  
  @Test
  public void k()
  {
	  Reporter.log("k",true);
  }
  
  @Test(priority = 1)
  public void a()
  {
	  Reporter.log("a",true);
  }
  
  @Test(priority = 4)
  public void h()
  {
	  Reporter.log("h",true);
  }
}
