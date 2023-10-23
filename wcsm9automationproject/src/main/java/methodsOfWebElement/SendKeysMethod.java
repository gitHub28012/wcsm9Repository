package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysMethod {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-k0cq021/login.do");
		Thread.sleep(2000);
		WebElement usnTB = driver.findElement(By.name("username"));
	    usnTB.sendKeys("admin");	
		Thread.sleep(2000);
		WebElement passTB = driver.findElement(By.name("pwd"));
		passTB.sendKeys("manager");
	}

}
