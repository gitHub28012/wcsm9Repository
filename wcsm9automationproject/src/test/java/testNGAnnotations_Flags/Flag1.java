package testNGAnnotations_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 {
	
	
  @Test(description = "This performs Login Opeartion!!!")
  public void method1() {
	  
	  Reporter.log("Method1 from Flag 1",true);
	  
	  
  }
  
}
