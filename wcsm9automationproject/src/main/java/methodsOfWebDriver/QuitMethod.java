package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {

	public static void main(String[] args) throws InterruptedException {
		//launch the chromeBrowser
		WebDriver driver=new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		//launch the webApplication
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(2000);
		// click on open a pop up window link
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		Thread.sleep(2000);
		//close all the browser or windows 
		driver.quit();
		
	}
	
}
