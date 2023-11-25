package pageObjectModelPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Satle {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("http://desktop-k0cq021/login.do");
		
		WebElement usnTB = driver.findElement(By.name("username"));
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		usnTB.sendKeys("admin");
	}

}
