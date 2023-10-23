package sychronaizationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoperStackSynchronize {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.shoppersstack.com/");

		driver.findElement(By.xpath("//img[@alt='SAMSUNG Galaxy Z Flip4 ']")).click();

		driver.findElement(By.id("Check Delivery")).sendKeys("411033");
		//apply explicit wait
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
//		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.id("Che")));
//		ele.click();
		WebElement checkButton = driver.findElement(By.id("Check"));
		explicitWait(driver,30, checkButton).click();
	}
	
	public static WebElement explicitWait(WebDriver driver,long sec,WebElement ele)
	{
	       WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(sec));	
	       WebElement element = wait.until(ExpectedConditions.elementToBeClickable(ele));
	       return element;
	}

}
