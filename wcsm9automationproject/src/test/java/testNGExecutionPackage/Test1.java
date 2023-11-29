package testNGExecutionPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {
  @Test
  public void method1() {
	  Reporter.log("method1 from Test1 class!", true);
  }
  
  @Test
  public void method2()
  {
	  Reporter.log("method2 from Test1 class!!", true);
  }
}
