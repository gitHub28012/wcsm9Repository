package actionsPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumContextClickMethod {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://selenium.dev");
		
		WebElement downloadeleTarget = driver.findElement(By.xpath("//span[text()='Downloads']"));
	
		
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.contextClick(downloadeleTarget).perform();
		
	}

}
