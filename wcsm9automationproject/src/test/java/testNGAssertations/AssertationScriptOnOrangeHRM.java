package testNGAssertations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertationScriptOnOrangeHRM {

	static WebDriver driver;

	@BeforeMethod
	public void setUp()
	{
       driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       driver.get("http://desktop-k0cq021/login.do");
	}

	@Test
	public void testMethod() throws InterruptedException {
		
		
		Thread.sleep(2000);
		   String expectedLoginTitle = "actiTIME - Login";
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(driver.getTitle(),expectedLoginTitle);
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		String expectedHomeTitle = "actiTIME - Enter Time-Track";
		
		Assert.assertEquals(driver.getTitle(),expectedHomeTitle);
		
		Reporter.log("User Created!!",true);
		
		WebElement logoutLink = driver.findElement(By.partialLinkText("Logout"));
		
		Assert.assertEquals(logoutLink.isDisplayed(),true);
		
		logoutLink.click();
		sa.assertAll();
		
	}
}
