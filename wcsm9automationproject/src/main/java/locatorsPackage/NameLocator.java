package locatorsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Qspiders%20Wakad/Desktop/wcsm9webelement/RadioButton.html");
		
		Thread.sleep(2000);
	   // identify D radio button by using name Locator
		driver.findElement(By.name("name4")).click();
	  // identify A radio button by using name Locator
		Thread.sleep(2000);
		driver.findElement(By.name("name1")).click();
		Thread.sleep(2000);
	
	}
}
