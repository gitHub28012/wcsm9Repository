package testNGExecutionPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
  @Test
  public void method1() {
	  Reporter.log("method1 from Test2 class!", true);
  }
  
  @Test
  public void method2()
  {
	  int a=5;
	  int b=1;
	  int res=a/b;
	  Reporter.log("method2 from Test2 class!!  "+res, true);  
  }
}
