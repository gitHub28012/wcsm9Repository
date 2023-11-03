package popHandlePackage;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptPopUp {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		
		driver.findElement(By.partialLinkText("Prompt")).click();
		
		Thread.sleep(2000);
		//generate prompt pop up
		driver.findElement(By.xpath("//button[text()='Prompt Alert Box']")).click();
		
		// handle prompt pop up
		Alert prompt = driver.switchTo().alert();
		
		//send response as yes or no
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("yes");
	//	prompt.sendKeys("yes");
		
		
		//accept prompt pop up
		Thread.sleep(2000);
		prompt.accept();
		
		//dismiss prompt pop up
		//prompt.dismiss();
		
		
	}

}
