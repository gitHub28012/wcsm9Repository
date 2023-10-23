package assignmentPackage;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Pass the browsername Which u want to launch");
		String browserValue = sc.next();
		
		if (browserValue.equalsIgnoreCase("chrome"))
		{
		   driver=new ChromeDriver();	
		}
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
		   driver=new FirefoxDriver();	
		}
		
		else if(browserValue.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			System.out.println("This not a browserValue!!");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		
		// search for the product
		 searchProdcut("Apple Watches");
		
	}
	
	public static void searchProdcut(String product) throws InterruptedException
	{
	   WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));	
	   searchBox.sendKeys(product);
	   Thread.sleep(2000);
	   driver.findElement(By.name("url")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//option[text()='Watches']")).click();
	}
}
