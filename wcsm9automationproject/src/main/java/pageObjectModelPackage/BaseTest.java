package pageObjectModelPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import keyWordDrivenFramework.Flib;

public class BaseTest extends Flib implements IautoConstant{
static WebDriver driver;
	
	public void setUp() throws IOException
	{
		Flib flib = new Flib();// read the data from property file .
		
		String browserValue = flib.readDataFromProperty(PROP_PATH,"Browser");
		String url = flib.readDataFromProperty(PROP_PATH,"Url");
		
		
		if(browserValue.equalsIgnoreCase("chrome"))
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
			System.out.println("Invalid BrowserValue!!!");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
		
	}
	
	
	public void tearDown()
	{
		driver.quit();
	}


}
