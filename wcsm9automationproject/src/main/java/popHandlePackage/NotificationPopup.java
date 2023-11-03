package popHandlePackage;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class NotificationPopup {
	
	static WebDriver driver;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter browserValue!!");
		String browserValue = sc.next();
		
		if(browserValue.equalsIgnoreCase("Chrome"))
		{
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--disable-notifications");
			
			 driver=new ChromeDriver(co);
		}
		else if(browserValue.equalsIgnoreCase("Firefox"))
		{
			FirefoxOptions fo = new FirefoxOptions();
			fo.addArguments("--disable-notifications");
			
			driver=new FirefoxDriver(fo);
		}
		else if(browserValue.equalsIgnoreCase("Edge"))
		{
			EdgeOptions eo = new EdgeOptions();
			eo.addArguments("--disable-notifications");
			
			driver=new EdgeDriver(eo);
		}
		else 
		{
			System.out.println("Enter valid BrowserValue!!!");
		}
		
		driver.get("https://www.irctc.co.in/nget/train-search");
	}

}
