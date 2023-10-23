package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rtp {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// to take inputs from users
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Browser Value!!");
		String browserValue = sc.next();
		
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();
		}
		else if(browserValue.equalsIgnoreCase("Firefox"))
		{
		    driver=new FirefoxDriver();
		    driver.manage().window().maximize();
		    Thread.sleep(2000);
		    driver.close();
		}
		else if(browserValue.equalsIgnoreCase("Edge"))
		{
		 	driver=new EdgeDriver();
		 	driver.manage().window().maximize();
		 	Thread.sleep(2000);
		 	driver.close();
		}
		else
		{
			System.out.println("Enter the valid browserValue!!!");
		}
	}

}
