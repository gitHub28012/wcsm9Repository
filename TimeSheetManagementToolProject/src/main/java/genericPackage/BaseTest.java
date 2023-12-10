package genericPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.google.common.io.Files;

public class BaseTest extends Flib implements IautoConstant{
	
	
	protected static WebDriver driver;
	
	@BeforeMethod
	public void setUp() throws IOException
	{
		// read data from config.properties file for browser and url
		Flib flib = new Flib();
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
			Reporter.log("You Enterd invalid BrowserValue!!",true);
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
	}

	
	public void failedSsMethod(String failedMethodName)
	{
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(SCREENSHOTS_PATH+failedMethodName+SCREENSHOTS_EXE);
		
		try
		{
		Files.copy(src, dest);
		}
		catch(Exception e)
		{
			
		}
		
	}
	
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
