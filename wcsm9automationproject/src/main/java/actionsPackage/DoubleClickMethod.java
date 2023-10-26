package actionsPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMethod {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		
		//click on double click action
		driver.findElement(By.partialLinkText("Double Click")).click();
		
		WebElement yesTarget = driver.findElement(By.xpath("(//button[text()='Yes'])[1]"));
		WebElement noTarget = driver.findElement(By.xpath("(//button[text()='No'])[2]"));
		WebElement scaleTarget = driver.findElement(By.xpath("//button[text()='5']"));

	    // perform double click on each targetElement
		Actions act = new Actions(driver);
		
		Thread.sleep(2000);
		act.doubleClick(yesTarget).perform();
		
		Thread.sleep(2000);
		act.doubleClick(noTarget).perform();
		
		Thread.sleep(2000);
		act.doubleClick(scaleTarget).perform();
	
	}

}
