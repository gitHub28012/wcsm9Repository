package javaScriptExecutorPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisableElement {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//p[text()='Disabled Mode']")).click();
		
		// explicit type casting into JavaScriptExecutor
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		// handle disable name text box
		Thread.sleep(2000);
		jse.executeScript("document.getElementById('name').value='Tanmay'");
		
		//handle disable email text box
		Thread.sleep(2000);
		jse.executeScript("document.getElementById('email').value='tanmay123@gmail.com'");
		
		// handle disable password text box
		Thread.sleep(2000);
		jse.executeScript("document.getElementById('password').value='tanmay123'");
		
		//click on disable register button
		WebElement disableRagisterButton = driver.findElement(By.xpath("//button[text()='Register']"));
	
		Thread.sleep(2000);
		if(disableRagisterButton.isDisplayed())
		{
			jse.executeScript("arguments[0].click()",disableRagisterButton);
			Thread.sleep(2000);
			jse.executeScript("arguments[0].click()",driver.findElement(By.xpath("//a[contains(@class,'bg-orange-5')]")));
			
			System.out.println("Click");
		}
		else 
		{
			System.out.println("Not Click");
		}
	}

}
