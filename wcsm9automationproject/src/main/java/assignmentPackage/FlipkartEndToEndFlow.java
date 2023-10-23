package assignmentPackage;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartEndToEndFlow {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[contains(@title,'Search')]")).click();
		//get the address of parent window.
		String parentHandle = driver.getWindowHandle();
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[2]")).click();
		// get the address of all the windows
		//Thread.sleep(4000);
		Set<String> allHandles = driver.getWindowHandles();
		for(String wh:allHandles)
		{
			if(!parentHandle.equals(wh))
			{
				driver.switchTo().window(wh);
				
			}
		}
	//	Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='_2C41yO'])[1]")).click();
		driver.findElement(By.partialLinkText("256 GB")).click();
		driver.findElement(By.id("pincodeInputId")).clear();
		driver.findElement(By.id("pincodeInputId")).sendKeys("411033");
		driver.findElement(By.xpath("//span[text()='Check']")).click();
		driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2U9uOA _')]")).click();
		  Thread.sleep(4000);
		  
		  
		WebElement removeButton = driver.findElement(By.xpath("//div[text()='Remove']"));
		Point loc = removeButton.getLocation();
		int xaxis = loc.getX();
		int yaxis = loc.getY();
		   JavascriptExecutor jse = (JavascriptExecutor)driver;
		   jse.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
		   Thread.sleep(4000);
		   removeButton.click();
		
		driver.findElement(By.xpath("//div[contains(@class,'_3dsJAO _24d-qY F')and text()='Remove']")).click();
		
		
	}

}
