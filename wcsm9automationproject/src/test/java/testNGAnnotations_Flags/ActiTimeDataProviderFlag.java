package testNGAnnotations_Flags;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ActiTimeDataProviderFlag {
	
	
	
	
  @Test(dataProvider = "TestData")
  public void invalidLoginMethod(String usn,String pass)
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
	    driver.get("http://desktop-k0cq021/login.do");
	  
	    driver.findElement(By.name("username")).sendKeys(usn);
		driver.findElement(By.name("pwd")).sendKeys(pass);
		driver.findElement(By.id("loginButton")).click();
	    driver.findElement(By.name("username")).clear();
	  
  }
  
  @DataProvider(name="TestData")
  public Object[][] actiTimeTestDataMethod()
  {
	  
	  
	  Object[][] testData = new Object [5] [2];
	  
	  testData [0][0]="ad_min";
	  testData [0][1]="mana_ger";
	  
	  testData [1][0]="ad123";
	  testData [1][1]="mana123";
	  
	  testData [2][0]="456min";
	  testData [2][1]="456ger";
	  
	  testData [3][0]="min";
	  testData [3][1]="add";
	  
	  testData [4][0]="manager";
	  testData [4][1]="admin";
	  
	  return testData;
	  
	  
  }
  
}
