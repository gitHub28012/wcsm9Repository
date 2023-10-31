package javaScriptExecutorPackage;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUp {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.selenium.dev");
		
		// perform scroll Down
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,500)");
		
		//perform scoll Up
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,-500)");
	}


}
