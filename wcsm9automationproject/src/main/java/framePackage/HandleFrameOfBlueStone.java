package framePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrameOfBlueStone {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/");
		
		Thread.sleep(2000);
		
		// handle hidden division pop up
		driver.findElement(By.id("denyBtn")).click();
		
		
		//switch the controls to frame
		//identify frame and store it is a WebElement
		WebElement frameElement = driver.findElement(By.id("fc_widget"));
		//driver.switchTo().frame(6);  // int index
		//driver.switchTo().frame("fc_widget"); // string name or id
		driver.switchTo().frame(frameElement); // WebElement FrameElement
		
		
		Thread.sleep(2000);
		
		//click on chat box
		driver.findElement(By.id("chat-icon")).click();
		
		// handle all text box present inside chatBox 
		//all the text box are designed under main webpage so switch back to main webpage
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("chat-fc-name")).sendKeys("tanmay");
		
		driver.findElement(By.id("chat-fc-email")).sendKeys("tanmay@123");
		
		driver.findElement(By.id("chat-fc-phone")).sendKeys("1234567890");
		
		driver.findElement(By.partialLinkText("Start Chat")).click();
		
	}

}
