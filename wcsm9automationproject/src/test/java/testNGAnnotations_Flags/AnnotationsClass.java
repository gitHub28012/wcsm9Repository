package testNGAnnotations_Flags;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsClass {
  @Test
  public void annotation_Test_Method() {
	  
	  Reporter.log("Test Annotation",true);
  }
  
  @BeforeMethod
  public void annotation_BeforeMethod()
  {
	  Reporter.log("Before Method Annotation",true);
  }
  
  @BeforeClass
  public void annotation_BeforeClass()
  {
	  Reporter.log("BeforeClass Annotation",true);
  }
  
  @AfterMethod
  public void annotation_AfterMethod()
  {
	  Reporter.log("AfterMethod Annotation",true);
  }
  
  @AfterClass
  public void annotation_AfterClass()
  {
	  Reporter.log("AfterClass Annotation",true);
  }
  
  @BeforeTest
  public void annotation_BeforeTest()
  {
	  Reporter.log("BeforeTest Annotation",true);
  }
  
  @BeforeSuite
  public void annotation_BeforeSuite()
  {
	  Reporter.log("BeforeSuite Annotation",true);
  }
  
  @AfterTest
  public void annotation_AfterTest()
  {
	  Reporter.log("AfterTest Annotation",true);
  }
  
  @AfterSuite
  public void annotation_AfterSuite()
  {
	  Reporter.log("AfterSuite Annotation",true);
  }
  
  @Test
  public void test2()
  {
	  Reporter.log("Test2 Annotation",true);
  }
  
  @Test
  public void test3()
  {
	  Reporter.log("Test3 Annotation",true);
  }
  
  @Test
  public void test4()
  {
	  Reporter.log("Test4 Annotation",true);
  }
  
  
  
}
