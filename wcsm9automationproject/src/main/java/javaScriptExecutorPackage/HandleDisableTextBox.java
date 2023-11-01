package javaScriptExecutorPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class HandleDisableTextBox {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://omayo.blogspot.com/");
		
		WebElement disableTextBox = driver.findElement(By.id("tb2"));
		Point loc = disableTextBox.getLocation();
		int xaxis = loc.getX();
		int yaxis = loc.getY();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-40)+")");
	
//		jse.executeScript("arguments[0].scrollIntoView(true)",disableTextBox);
		
		Thread.sleep(2000);
		jse.executeScript("document.getElementById('tb2').value='Automation Testing'");
		
		Thread.sleep(2000);
		File src = disableTextBox.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/disableTextBox.png");
		Files.copy(src, dest);
		
		
	}

}
