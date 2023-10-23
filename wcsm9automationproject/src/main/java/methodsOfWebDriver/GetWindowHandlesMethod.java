package methodsOfWebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandlesMethod {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(2000);
		// take the address of current window or browser
		//parent browser...{the browser or window has controls}
		String parentHandle = driver.getWindowHandle();
		System.out.println("address of parent Browser or window "+parentHandle);
		Thread.sleep(2000);
		// click on open a pop window 
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		// get the address of parent browser as well as child browser
		Set<String> allHandles = driver.getWindowHandles();
		// print the address of browsers use for each loop
		for(String wh:allHandles)
		{
		 //  System.out.println("parent Handle :"+wh+" child  Handle : "+wh);
			if(!parentHandle.equals(wh))
			{
				System.out.println("address of child window :"+wh);
				Thread.sleep(2000);
			    TargetLocator switchTo = driver.switchTo();
			    switchTo.window(wh).manage().window().maximize();
			    Thread.sleep(2000);
			    switchTo.window(wh).close();
			    
				
			}
			else
			{
				System.out.println("address of parent window :"+wh);
			}
		   
		}
		
		
	}

}
