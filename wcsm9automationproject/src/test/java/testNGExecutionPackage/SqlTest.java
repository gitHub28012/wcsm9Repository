package testNGExecutionPackage;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SqlTest {
  @Test
  public void sql_method() throws InterruptedException {
	  
	  WebDriver driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("https://www.google.com");
	  Thread.sleep(2000);
	  driver.switchTo().activeElement().sendKeys("SQL",Keys.ENTER);
	  Thread.sleep(4000);
	  driver.close();
  }
}
