package actionsPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WithoutActionsClass {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/");
		
		driver.findElement(By.id("denyBtn")).click();
		
		
		WebElement conisTarget = driver.findElement(By.xpath("//a[text()='Coins ']"));
		
		
			Thread.sleep(2000);
		// use actions class for mouseHover
		Actions act = new Actions(driver);
		
		act.moveToElement(conisTarget).build().perform();
		
		
	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Coins by Design']")).click();
		
		if(driver.findElement(By.xpath("//h1[text()=' Lakshmigoldcoins ']")).isDisplayed())
		{
			System.out.println("text displayed!!");
		}
		
		else 
		{
			System.out.println("text not displayed!!");	
		}
		
	}

}
