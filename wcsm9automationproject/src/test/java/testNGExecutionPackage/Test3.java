package testNGExecutionPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test3 {
  @Test
  public void method1() {
	  Reporter.log("method1 from Test3 class!", true);
  }
  
  @Test
  public void method2()
  {
	  Reporter.log("method2 from Test3 class!!", true);
  }
}
