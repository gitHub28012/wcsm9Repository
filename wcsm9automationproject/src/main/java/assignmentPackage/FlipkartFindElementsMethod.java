package assignmentPackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartFindElementsMethod {
	
	public static void main(String[] args) throws InterruptedException {
		// launch the browsers
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//launch the web application
		driver.get("https://www.flipkart.com/");
		//handle the pop up
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		//search for laptops in search box
		driver.findElement(By.name("q")).sendKeys("Laptops");
		//click on search icon
		driver.findElement(By.xpath("//button[@aria-label='Search for Products, Brands and More']")).click();
		//click on brand and select the hp 
		driver.findElement(By.xpath("//div[text()='Brand']")).click();
		driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='HP')]")).click();
		//click on core 7 from processor 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='Core i7')]")).click();
		//click on os and select the windows 11
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Operating System']")).click();
		driver.findElement(By.xpath("//div[text()='Windows 11']")).click();
		//select the 4 and above ratings from customer ratings 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='4★ & above']")).click();
		Thread.sleep(2000);
		//identify the name of laptops
		 List<WebElement> allLaptops = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		//identify the price of laptops
		 List<WebElement> allPrices = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
		 for(int i=0;i<allLaptops.size();i++)
		{
			String laptop = allLaptops.get(i).getText();
			Thread.sleep(2000);
		 
			for(int j=i;j<=i;j++)
			{
				String price = allPrices.get(j).getText();
				Thread.sleep(2000);
				System.out.println(laptop+"  : "+price);
				
			}
			
		}
	}

}
