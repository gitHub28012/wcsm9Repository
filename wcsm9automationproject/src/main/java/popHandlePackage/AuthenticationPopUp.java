package popHandlePackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUp {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demoapps.qspiders.com/");
		
		//generate authentication pop up
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		
		driver.findElement(By.xpath("//section[text()='Authentication']")).click();
		
		//address of authentication page window
		String authPageWindowHandle = driver.getWindowHandle();
		
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Login")).click();
		
		Thread.sleep(2000);
		
		//get the address of all present windows 
		Set<String> allWindowHandles = driver.getWindowHandles();
		
		//shift controls to authentication pop up window page
		for(String wh:allWindowHandles)
		{
			if(!authPageWindowHandle.equals(wh))
			{
				driver.switchTo().window(wh);
			}
		}
		Thread.sleep(2000);
		
		// handle authentication pop up
		handle_authentication_popup();
		
		
	}
	
	
	
	public static void handle_authentication_popup() throws AWTException
	{
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_D);
		robot.keyPress(KeyEvent.VK_M);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_N);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_D);
		robot.keyPress(KeyEvent.VK_M);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_N);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
	}

}
